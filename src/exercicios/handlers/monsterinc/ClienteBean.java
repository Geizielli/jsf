package exercicios.handlers.monsterinc;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exercicios.models.monsterinc.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean {
	private Cliente cliente;
	private List<Cliente> clientes;
	
	public ClienteBean() {
		cliente = new Cliente();
		clientes = new ArrayList<>();
	}
	
	public String add() {
		clientes.add(cliente);
		setCliente(new Cliente());
		return "/exercicios/monsterinc/cliente/listar";
	}
	
	public String remove() {
		clientes.remove(cliente);
		setCliente(new Cliente());
		return "/exercicios/monsterinc/cliente/listar";
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
