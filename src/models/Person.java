package models;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
	private static final long serialVersionUID = -1866514284230829377L;
	
	private String name;
	private Date nascimento;
	private Double peso;
	private Long telefone;
	
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

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
}
