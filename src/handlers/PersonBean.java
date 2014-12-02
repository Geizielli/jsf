package handlers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.primefaces.model.LazyDataModel;

import util.JPA;
import models.Person;
import models.PersonList;

@ManagedBean
@ViewScoped
public class PersonBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Person person;
	private LazyDataModel<Person> people = null;
	
	public PersonBean() {
		person = new Person();
	}
	
	public String addPerson() {
		EntityManager em = JPA.getEM();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		setPerson(new Person());
		return "/person/list";
	}
	
	public String removePerson() {
		
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
	
	public LazyDataModel<Person> getPeople() {
		if (people == null) {
			people = new PersonList();
		}
		
		return people;
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
