package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_product")
	private Integer id;
	@Column(name="label",nullable=false)
	private String libelle;
	@Column(name="price",columnDefinition = "DECIMAL(5,2)",nullable=false)
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="vendeur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "produit")
	private List<Achat> vente;

	
	//---------------setter/getter-------------
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public List<Achat> getVente() {
		return vente;
	}
	public void setVente(List<Achat> vente) {
		this.vente = vente;}
	
	
	
	//-------------------toString/Consructeur-----------
	
	public Produit(String libelle, double prix, Fournisseur fournisseur) {
		this.libelle = libelle;
		this.prix = prix;
		this.fournisseur = fournisseur;
	}
	public Produit() {}
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", fournisseur=" + fournisseur
				+ ", getId()=" + getId() + ", getLibelle()=" + getLibelle() + ", getPrix()=" + getPrix()
				+ ", getFournisseur()=" + getFournisseur() + "]";
	}
	
	
	
}
