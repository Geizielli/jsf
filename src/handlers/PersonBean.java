package handlers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Person;

@ManagedBean
@SessionScoped
public class PersonBean {
	
	private Person person;
	private List<Person> people = new ArrayList<>();;
	
	public PersonBean() {
		person = new Person();
	}
	
	public String addPerson() {
		people.add(new Person(person.getName()));
		return "person/register";
	}
	
	public String clearPerson() {
		setPerson(new Person());
		people = new ArrayList<>();
		return null;
	}
	
	public List<Person> getPeople() {
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
