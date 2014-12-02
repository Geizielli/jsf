package exercicios.handlers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import util.JPA;
import exercicios.models.Cachorro;

@ManagedBean
public class CachorroBean {

	private Cachorro dog;

	public CachorroBean() {
		dog = new Cachorro();
	}

	public List<Cachorro> getCaes() {
		EntityManager em = JPA.getEM();
		TypedQuery<Cachorro> query = em.createQuery("Select c from Cachorro c",
				Cachorro.class);
		
		return query.getResultList();
	}

	public String addCao() {
		EntityManager em = JPA.getEM();
		em.getTransaction().begin();
		em.persist(dog);
		em.getTransaction().commit();

		setDog(new Cachorro());

		return "/exercicios/cachorro/listar";
	}

	public Cachorro getDog() {
		return dog;
	}

	public void setDog(Cachorro dog) {
		this.dog = dog;
	}

}
