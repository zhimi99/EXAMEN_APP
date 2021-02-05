package ups.ZhiminaicelaChristianSRIJEE.negocio;

import java.util.UUID;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.ZhiminaicelaChristianSRIJEE.dao.FacturaDao;
import ups.ZhiminaicelaChristianSRIJEE.entidades.Factura;


@Stateless
public class FacturaOn {

	@Inject
	private FacturaDao dao;
	
	public String autorizar(Factura factura) {
		String mensaje = "";
		int n = (int) (Math.random() * (0 - 10)) + 10;
		
		if(n >  5) {
			dao.guardarFactura(factura);
			UUID uuid = UUID.randomUUID();
			mensaje = uuid.toString();
		} else {
			mensaje = "errorsri";
		}
		return mensaje;
	}
}
