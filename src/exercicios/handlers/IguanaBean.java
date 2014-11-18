package exercicios.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.models.Iguana;

@ManagedBean
@SessionScoped
public class IguanaBean {
	
	private Iguana iguana;
	private List<Iguana> iguanas;
	
	public IguanaBean() {
		setIguana(new Iguana());
		setIguanas(new ArrayList<>());
	}
	
	public String add() {
		iguanas.add(iguana);
		setIguana(new Iguana());
		return "/exercicios/iguana/listar";
	}
	
	public Iguana getIguana() {
		return iguana;
	}
	public void setIguana(Iguana iguana) {
		this.iguana = iguana;
	}
	public List<Iguana> getIguanas() {
		return iguanas;
	}
	public void setIguanas(List<Iguana> iguanas) {
		this.iguanas = iguanas;
	}
	
	
}
