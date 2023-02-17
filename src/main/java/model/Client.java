package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("customer")
public class Client extends Personne{
	
	private int age;
	@Column(name="birthday")
	private LocalDate date_de_naissance;
	
	@ManyToMany
	@JoinTable(name="achats",
			joinColumns = @JoinColumn(name="acheteur"),
			inverseJoinColumns =@JoinColumn(name="produit"))
	private List<Produit> produits = new ArrayList();
	
	
	/*@JoinTable(
			name="achats",
			joinColumns = @JoinColumn(name="acheteur"),
			inverseJoinColumns =@JoinColumn(name="produit"))*/
	
	
	//--------------------Getter/Setter-----------------
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(LocalDate date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	//--------------------Constructeur-----------------
	public Client(String nom, String prenom, Adresse adresse, int age, LocalDate date_de_naissance) {
		super(nom, prenom, adresse);
		this.age = age;
		this.date_de_naissance = date_de_naissance;
	}
	@Override
	public String toString() {
		return "Client [age=" + age + ", date_de_naissance=" + date_de_naissance + ", id=" + id + ", nom=" + nom
				+ ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	public Client() {}
	
}
