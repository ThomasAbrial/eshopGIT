package test;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Adresse;
import model.Client;
import model.Fournisseur;
import model.Personne;
import model.Produit;

public class Test {

	public static void main(String[] args) {

		Adresse a1 = new Adresse("12","rue du client","43586","Clientville");
		Adresse a2 = new Adresse("666","Workered Road","????","Corporate Square");
		
		Client c1 = new Client("familyname","firstname",a1,24,LocalDate.parse("1999-09-09"));
		Client c2 = new Client("nomdefamille","prenom",a1,25,LocalDate.parse("1998-01-01"));

		Produit produit1 = new Produit("product",666.6);
		Produit produit2 = new Produit("produit",0.99);
		Produit produit3 = new Produit("pomme",1.23);
		
		Fournisseur f1 = new Fournisseur("Worker","Working",a2,"Workerino.corp");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eshopUnit");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(c1);
		em.persist(c2);

		em.persist(produit1);
		em.persist(produit2);
		em.persist(produit3);

		em.getTransaction().commit();

		System.out.println(em.find(Personne.class,2));
		System.out.println(em.find(Produit.class,2));

		em.close();
		emf.close();
	}

}
