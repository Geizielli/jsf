package exercicios.handlers.betainc;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.models.betainc.Vendedor;

@ManagedBean
@SessionScoped
public class VendedorBean {
	private Vendedor vendedor;
	private List<Vendedor> vendedores;
	
	public VendedorBean() {
		vendedor = new Vendedor();
		vendedores = new ArrayList<>();
	}
	
	public String add() {
		vendedores.add(vendedor);
		setVendedor(new Vendedor());
		return "/exercicios/betainc/vendedor/listar";
	}
	
	public String remove() {
		vendedores.remove(vendedor);
		setVendedor(new Vendedor());
		return "/exercicios/betainc/vendedor/listar";
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
}
