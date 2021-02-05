package ups.ZhiminaicelaChristianOperadoraJEE.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.ZhiminaicelaChristianOperadoraJEE.entidades.Recarga;

@Stateless
public class RecargaDao {

	@PersistenceContext
	private EntityManager em;
	
	public void realizarRecarga(Recarga recarga) {
		em.persist(recarga);
	}
	
}
