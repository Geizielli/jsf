package handlers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import util.JPA;
import models.Person;

@ManagedBean
@SessionScoped
public class PersonBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Person person;
	private List<Person> people;
	
	public PersonBean() {
		person = new Person();
		people = new ArrayList<>();
	}
	
	public String addPerson() {
		people.add(person);
		
		EntityManager em = JPA.getEM();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		setPerson(new Person());
		return "/person/list";
	}
	
	public String removePerson() {
		people.remove(person);
		
		EntityManager em = JPA.getEM();
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		
		setPerson(new Person());
		return "/person/list";
	}
	
	public String clearPeople() {
		setPerson(new Person());
		return "/person/register";
	}
	
	public List<Person> getPeople() {
		EntityManager em = JPA.getEM();
		TypedQuery<Person> query = em.createQuery("SELECT p from Person p", Person.class);
		return query.getResultList();
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String list() {
		return "/person/list";
	}
}
