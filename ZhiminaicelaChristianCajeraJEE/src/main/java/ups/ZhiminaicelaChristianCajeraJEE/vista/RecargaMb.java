package ups.ZhiminaicelaChristianCajeraJEE.vista;

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
public class RecargaMb {

	
	@Inject
	private ClienteOn on;
	
	private String cuentaNumero;
	
	private Cliente cliente;
	private String celular;
	private String mensaje;
	
	private double saldo;
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		cuentaNumero = "";
		mensaje = "";
		celular = "";
		saldo = 0;
	}

	public String recargar() {
		
		mensaje =  on.buscarCliente(cuentaNumero, saldo);
		System.out.println(cliente.toString());
		return "";
	}
	
	public String getCuentaNumero() {
		return cuentaNumero;
	}

	public void setCuentaNumero(String cuentaNumero) {
		this.cuentaNumero = cuentaNumero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
