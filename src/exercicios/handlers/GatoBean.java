package exercicios.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.models.Gato;

@ManagedBean
@SessionScoped
public class GatoBean {

	private Gato cat;
	private List<Gato> gatos;
	
	public GatoBean() {
		cat = new Gato();
		gatos = new ArrayList<>();
	}
	
	public String addCat() {
		gatos.add(new Gato(cat));
		this.cat = new Gato();
		return "/exercicios/gato/listar";
	}
	
	public String clearCat() {
		gatos.clear();
		cat = new Gato();
		
		return "/exercicios/gato/listar";
	}
	
	public Gato getCat() {
		return cat;
	}
	public void setCat(Gato cat) {
		this.cat = cat;
	}
	public List<Gato> getGatos() {
		return gatos;
	}
	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
	}
	
	
	
}
