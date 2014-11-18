package exercicios.models;

public class Iguana {
	private String nome;
	private Integer idade;
	
	public Iguana() {}
	public Iguana(Iguana iguana) {
		setNome(iguana.getNome());
		setIdade(iguana.getIdade());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
