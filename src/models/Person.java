package models;

public class Person {
	
	public Person() {};
	public Person(String name) {
		setName(name);
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
