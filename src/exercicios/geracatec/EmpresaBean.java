package exercicios.geracatec;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.geracatec.models.Empresa;

@ManagedBean
@SessionScoped
public class EmpresaBean {
	private Empresa empresa;
	private List<Empresa> empresas;
	
	public EmpresaBean() {
		empresa = new Empresa();
		empresas = new ArrayList<Empresa>(); 
	}
	
	public String add() {
		empresas.add(empresa);
		setEmpresa(new Empresa());
		return "/exercicios/geracaotec/empresas/listar";
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	
	
}
