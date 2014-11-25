package exercicios.models;

import java.util.Date;

// TODO verificar conversão de ponto flutuante
public class Cobra {
	private String nome;
	private Date captura;
	private Float tamanho;
	private Float peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getCaptura() {
		return captura;
	}
	public void setCaptura(Date captura) {
		this.captura = captura;
	}
	public Float getTamanho() {
		return tamanho;
	}
	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
}
