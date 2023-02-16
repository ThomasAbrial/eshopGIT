package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Personne;
import model.Produit;

public class Test {

	public static void main(String[] args) {

		Personne personne1 = new Personne("familyname","firstname");
		Personne personne2 = new Personne("nomdefamille","prenom");

		Produit produit1 = new Produit("product",666.6);
		Produit produit2 = new Produit("produit",0.99);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eshop");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(personne1);
		em.persist(produit1);

		em.persist(personne2);
		em.persist(produit2);

		em.getTransaction().commit();

		System.out.println(em.find(Personne.class,2));
		System.out.println(em.find(Produit.class,2));

		em.close();
		emf.close();
	}

}
