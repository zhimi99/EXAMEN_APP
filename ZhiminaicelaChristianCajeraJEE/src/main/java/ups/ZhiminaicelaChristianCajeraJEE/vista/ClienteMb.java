package ups.ZhiminaicelaChristianCajeraJEE.vista;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ups.ZhiminaicelaChristianCajeraJEE.entidades.Cliente;
import ups.ZhiminaicelaChristianCajeraJEE.negocio.ClienteOn;

@Named
//@ConversationScoped
@ViewScoped
public class ClienteMb {

	@Inject
	private ClienteOn on;
	
	private Cliente cliente;
	
	List<Cliente> clientes;
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		clientes  = on.listarClientes();
	}
	
	
	public String crearCliente() {
		on.crearCliente(cliente);
		return "";
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
