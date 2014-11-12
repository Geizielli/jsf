package handlers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PersonBean {
	
	private String name;
	
	public void spellName() {
		setName(name);
	}
	
	public void clearName() {
		setName(null);
	}
	
	public List<String> getPersons() {
		List<String> persons = new ArrayList<String>();
		persons.add("Nassor");
		persons.add("Mimimi");
		persons.add("Lalala");
		return persons;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
