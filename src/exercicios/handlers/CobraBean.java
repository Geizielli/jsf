package exercicios.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.models.Cobra;

@ManagedBean
@SessionScoped
public class CobraBean {
	
	private Cobra cobra;
	private List<Cobra> cobras;
	
	public CobraBean() {
		setCobra(new Cobra());
		setCobras(new ArrayList<>());
	}
	
	public String add() {
		cobras.add(cobra);
		setCobra(new Cobra());
		return "/exercicios/cobra/listar";
	}

	public Cobra getCobra() {
		return cobra;
	}

	public void setCobra(Cobra cobra) {
		this.cobra = cobra;
	}

	public List<Cobra> getCobras() {
		return cobras;
	}

	public void setCobras(List<Cobra> cobras) {
		this.cobras = cobras;
	}
	
}
