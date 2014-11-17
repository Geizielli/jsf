package exercicios.models;

public class Gato {
	private String nome;
	private String raca;
	private Integer idade;
	
	public Gato() {};
	public Gato(Gato gato) {
		this.nome = gato.nome;
		this.raca = gato.raca;
		this.idade = gato.idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
