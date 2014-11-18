package models;

import java.util.Date;

public class Person {
	
	private String name;
	private Date nascimento;
	private Double peso;
	
	public Person() {};
	
	public Person(Person person) {
		setName(person.getName());
		setNascimento(person.getNascimento());
		setPeso(person.getPeso());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
}
