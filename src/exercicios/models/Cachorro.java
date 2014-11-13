package exercicios.models;

public class Cachorro {
	
	private String nome;
	private String raca;
	private Integer idade;
	
	public Cachorro() {};
	public Cachorro(String nome, String raca, Integer idade) {
		setNome(nome);
		setRaca(raca);
		setIdade(idade);
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
