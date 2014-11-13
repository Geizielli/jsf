package exercicios.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import exercicios.models.Cachorro;

@ManagedBean
public class CachorroBean {
	
	private Cachorro dog;
	
	public CachorroBean() {
		dog = new Cachorro();
	}
	
	public List<Cachorro> getCaes() {
		List<Cachorro> caes = new ArrayList<>();
		caes.add(new Cachorro("Costelinha", "poodle", 1));
		caes.add(new Cachorro("Ringo", "Cocker", 2));
		return caes;
	}
	
	public String addCao() {
		setDog(dog);
		return "";
	}

	public Cachorro getDog() {
		return dog;
	}

	public void setDog(Cachorro dog) {
		this.dog = dog;
	}

}
