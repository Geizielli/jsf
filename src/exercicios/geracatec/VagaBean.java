package exercicios.geracatec;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.geracatec.models.Vaga;

@ManagedBean
@SessionScoped
public class VagaBean {
	
	private Vaga vaga;
	private List<Vaga> vagas;
	
	public VagaBean() {
		vaga = new Vaga();
		vagas = new ArrayList<Vaga>();
	}
	
	public String add() {
		vagas.add(vaga);
		setVaga(new Vaga());
		return "/exercicios/geracaotec/vagas/listar";
	}
	
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	public List<Vaga> getVagas() {
		return vagas;
	}
	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}
}
