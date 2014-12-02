package models;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import util.JPA;

public class PersonList extends LazyDataModel<Person> {
	private static final long serialVersionUID = 1L;
	
	private List<Person> people;
	
	@Override
	public List<Person> load(int iniciaEm, int maximoPorPagina, String sortField, SortOrder sortOrder, Map<String,Object> filters) {
		EntityManager em = JPA.getEM();
		TypedQuery<Person> query = em.createQuery("SELECT p from Person p", Person.class);
		query.setFirstResult(iniciaEm);
		query.setMaxResults(maximoPorPagina);
		people = query.getResultList();
		
		// total de resultados
        if(getRowCount() <= 0){
            setRowCount(countPeople());
        }
		
        // total por página
        setPageSize(maximoPorPagina);
		return people;
	}
	
	@Override
    public Object getRowKey(Person person) {
        return person.getId();
    }
	
	@Override
    public Person getRowData(String playerId) {
        Integer id = Integer.valueOf(playerId);
 
        for (Person person: people) {
            if(id.equals(person.getId())){
                return person;
            }
        }
        
        return null;
    }
	
	private int countPeople() {
		EntityManager em = JPA.getEM();
        Query query = em.createQuery("select COUNT(p) from Person p");
        Number result = (Number) query.getSingleResult();
 
        return result.intValue();
	}
}
