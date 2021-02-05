package ups.ZhiminaicelaChristianCajeraJEE.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.ZhiminaicelaChristianCajeraJEE.entidades.Cliente;

@Stateless
public class ClienteDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void crearCliente(Cliente cliente) {
		em.persist(cliente);
	}
	
	public List<Cliente>  listarClientes() {
		String jpql = "select c from Cliente c";
		Query query = em.createQuery(jpql, Cliente.class);
		List<Cliente> clientes = query.getResultList();
		return clientes;
		
	}
	
	public Cliente buscarCliente(String cedula) {
		String jpql = "select c from Cliente c where c.cedula = :cedula";
		Query query =  em.createQuery(jpql, Cliente.class);
		query.setParameter("cedula", cedula);
		return (Cliente) query.getSingleResult();
	}
	
	public void actualizar(Cliente cliente) {
		em.merge(cliente);
	}

}
