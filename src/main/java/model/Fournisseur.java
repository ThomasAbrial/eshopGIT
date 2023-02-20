package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("supplier")
public class Fournisseur extends Personne{

	@Column(name="company",unique=true)
	private String societe;
	
	@OneToMany
	private List<Produit> produits;
	
	
	//--------------------Getter/Setter-----------------
	
	
	public String getSociete() {
		return societe;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	//--------------------constructeur-----------------
	
	public Fournisseur() {
		
	}

	public Fournisseur(String nom, String prenom, Adresse adresse, String societe) {
		super(nom, prenom, adresse);
		this.societe = societe;
	}

	@Override
	public String toString() {
		return "Fournisseur [societe=" + societe + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + "]";
	}


	
	
	
}
