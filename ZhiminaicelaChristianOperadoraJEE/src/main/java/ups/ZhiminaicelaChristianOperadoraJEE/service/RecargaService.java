package ups.ZhiminaicelaChristianOperadoraJEE.service;

import javax.inject.Inject;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ups.ZhiminaicelaChristianOperadoraJEE.entidades.Recarga;
import ups.ZhiminaicelaChristianOperadoraJEE.negocio.RecargaOn;


@Path("/recargar")
public class RecargaService {
	
	@Inject
	private RecargaOn on;
	
	@POST
	@Path("/nuevo")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Response recargar(Recarga recarga) {
		String mensaje = on.recargar(recarga);
		return Response.status(200).entity(mensaje).build();
	}
	
}
