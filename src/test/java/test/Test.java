package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Achat;
import model.Adresse;
import model.Client;
import model.Fournisseur;
import model.Personne;
import model.Produit;

public class Test {

	public static void main(String[] args) {

		Adresse a1 = new Adresse("12","rue du client","43586","Clientville");
		Adresse a2 = new Adresse("666","Workered Road","9999","Corporate Square");

		Client c1 = new Client("Andy","Lobster",a1,24,LocalDate.parse("1979-09-09"));
		Client c2 = new Client("Henry","Pottier",a1,25,LocalDate.parse("1998-01-01"));

		Fournisseur f1 = new Fournisseur("Worker","Working",a2,"Workerino.corp");

		Produit produit1 = new Produit("Chips",666.6,f1);
		Produit produit2 = new Produit("Maquereaux",0.99,f1);
		Produit produit3 = new Produit("pomme",1.23,f1);
		
		Achat achat1 = new Achat(c1,produit1);
		Achat achat2 = new Achat(c1,produit2);
		Achat achat3 = new Achat(c1,produit3);
	

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eshopUnit");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(c1);
		em.persist(c2);
		em.persist(f1);

		em.persist(produit1);
		em.persist(produit2);
		em.persist(produit3);
		
		em.persist(achat1);
		em.persist(achat2);
		em.persist(achat3);

		em.getTransaction().commit();

		/*System.out.println(em.find(Personne.class,2));
		System.out.println(em.find(Produit.class,2));
		 */

		em.close();
		emf.close();
	}

}
