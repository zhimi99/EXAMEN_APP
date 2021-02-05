package ups.ZhiminaicelaChristianOperadoraJEE.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import ups.ZhiminaicelaChristianOperadoraJEE.dao.RecargaDao;
import ups.ZhiminaicelaChristianOperadoraJEE.entidades.Factura;
import ups.ZhiminaicelaChristianOperadoraJEE.entidades.Recarga;


@Stateless
public class RecargaOn {

	@Inject
	private RecargaDao dao;
	
	
	public String recargar(Recarga recarga) {
		String mensaje = "";
		int n = (int) (Math.random() * (0 - 10)) + 10;
		if(n >  5) {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:8080/ZhiminaicelaChristianSRIJEE/ws/factura/nuevo");
			Factura factura =  new Factura();
			factura.setCedula(recarga.getCedula());
			factura.setNumeroFactura(((int) (Math.random() * (0 - 1000)) + 1000)+"---"+((int) (Math.random() * (0 - 1000)) + 1000)+"---"+((int) (Math.random() * (0 - 1000)) + 1000));
			factura.setValor(recarga.getSaldo());
			String respuesta = target.request().post(Entity.json(factura), String.class);
			if(recarga.equals("errorsri")) {
				mensaje ="Operadora aprobo, pero sri no autorizo";
			} else {
				dao.realizarRecarga(recarga);
				mensaje = respuesta;
			}
		} else {
			mensaje = "errorop";
		}
		return mensaje;
	}
	
}
