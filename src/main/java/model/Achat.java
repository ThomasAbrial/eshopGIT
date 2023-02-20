package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Client client;
	@ManyToOne
	private Produit produit;
	private LocalDate date_achat;
	
	//--------------------Getter/Setter-----------------
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public LocalDate getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(LocalDate date_achat) {
		this.date_achat = date_achat;
	}
	
	//--------------------constructeur-----------------
	public Achat(Client client, Produit produit) {
		this.client = client;
		this.produit = produit;
		this.date_achat=LocalDate.now();
	}
	public Achat() {}
	@Override
	public String toString() {
		return "Achat [id=" + id + ", client=" + client + ", produit=" + produit + ", date_achat=" + date_achat + "]";
	}
	
	

	
}
