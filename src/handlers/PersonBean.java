package handlers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import models.Person;

@ManagedBean
@SessionScoped
public class PersonBean {
	
	private Person person;
	private List<Person> people;
	
	public PersonBean() {
		person = new Person();
		people = new ArrayList<>();
		
		Date d = new Date();
		long mimimi = d.getTime();
		
		Date d_deprc = new Date(1992, 7, 20);
		
		
		
	}
	
	public String addPerson() {
		people.add(new Person(person));
		setPerson(new Person());
		return "/person/list";
	}
	
	public String clearPeople() {
		setPerson(new Person());
		people = new ArrayList<>();
		return "/person/register";
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
