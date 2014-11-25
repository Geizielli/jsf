package exercicios.models.betainc;

import java.util.Date;

public class Cliente {
	private String nome;
	private Date nascimento;
	private String endereco;
	private Double gasto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Double getGasto() {
		return gasto;
	}
	public void setGasto(Double gasto) {
		this.gasto = gasto;
	}
}
