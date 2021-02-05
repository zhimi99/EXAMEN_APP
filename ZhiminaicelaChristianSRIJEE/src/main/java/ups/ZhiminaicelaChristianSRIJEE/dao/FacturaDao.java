package ups.ZhiminaicelaChristianSRIJEE.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.ZhiminaicelaChristianSRIJEE.entidades.Factura;

@Stateless
public class FacturaDao {

	@PersistenceContext
	private EntityManager em;
	
	public void  guardarFactura(Factura factura) {
		em.persist(factura);
	}
}
