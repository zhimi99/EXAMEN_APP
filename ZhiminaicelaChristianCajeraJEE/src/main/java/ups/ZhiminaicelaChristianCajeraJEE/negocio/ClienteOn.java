package ups.ZhiminaicelaChristianCajeraJEE.negocio;

import java.util.List;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import ups.ZhiminaicelaChristianCajeraJEE.dao.ClienteDao;
import ups.ZhiminaicelaChristianCajeraJEE.entidades.Cliente;
import ups.ZhiminaicelaChristianCajeraJEE.entidades.Recarga;


@Stateless
public class ClienteOn {

	@Inject
	private ClienteDao dao;
	
	
	public void crearCliente(Cliente cliente) {
		dao.crearCliente(cliente);
	}
	
	public List<Cliente> listarClientes() {
		return dao.listarClientes();
	}
	
	
	public String  buscarCliente(String cedula, double saldo) {
		Cliente cliente = dao.buscarCliente(cedula);
		double saldoActual = 0;
		if (cliente != null) {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:8080/ZhiminaicelaChristianOperadoraJEE/ws/recargar/nuevo");
			Recarga recarga =  new Recarga();
			recarga.setNumero(cliente.getCedular());
			recarga.setCedula(cliente.getCedula());
			recarga.setCuenta(cliente.getCuenta());
			recarga.setSaldo(saldo);
			saldoActual = cliente.getSaldo();
			String respuesta = target.request().post(Entity.json(recarga), String.class);
			if (respuesta.equals("errorop")) {
				respuesta = "Error en la operadora";
				return respuesta;
			} else if (respuesta.equals("errorsri")) {
				respuesta = "Error en la autorizacion del SRI";
				return respuesta;	
			} else {
				cliente.setSaldo(saldoActual-saldo);
				dao.actualizar(cliente);
				return "Recargar exitosa, verifica tu saldo, numero de autorizacion del SRI: "+respuesta;
			}
			
		}
		return "no existe el cliente";
		
	}
	
}
