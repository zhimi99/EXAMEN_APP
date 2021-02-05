package ups.ZhiminaicelaChristianSRIJEE.service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ups.ZhiminaicelaChristianSRIJEE.entidades.Factura;
import ups.ZhiminaicelaChristianSRIJEE.negocio.FacturaOn;


@Path("/factura")
public class FacturaService {

	@Inject
	private FacturaOn on;
	
	
	@POST
	@Path("/nuevo")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Response autorizar(Factura factura) {
		String mensaje = on.autorizar(factura);
		return Response.status(200).entity(mensaje).build();
	}
}
