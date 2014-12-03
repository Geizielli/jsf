package exercicios.handlers.betainc;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import exercicios.models.betainc.Cliente;
import exercicios.models.betainc.Vendedor;

@ManagedBean
@SessionScoped
public class ClienteBean {
	
	@ManagedProperty("#{vendedorBean}")
	private VendedorBean vendedorBean;
	
	private Cliente cliente;
	private List<Cliente> clientes;
	
	public ClienteBean() {
		cliente = new Cliente();
		clientes = new ArrayList<>();
	}
	
	public String add() {
		cliente.setVendedor(vendedorBean.getVendedor());
		clientes.add(cliente);
		setCliente(new Cliente());
		vendedorBean.setVendedor(new Vendedor());
		return "/exercicios/betainc/cliente/listar";
	}
	
	public String remove() {
		clientes.remove(cliente);
		setCliente(new Cliente());
		return "/exercicios/betainc/cliente/listar";
	}
	
	public void setVendedorBean(VendedorBean vendedorBean) {
		this.vendedorBean = vendedorBean;
	}
	
	public VendedorBean getVendedorBean() {
		return this.vendedorBean;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
