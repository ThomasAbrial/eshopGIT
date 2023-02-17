package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("supplier")
public class Fournisseur extends Personne{

	private String societe;

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	
	public Fournisseur( String nom, String prenom, Adresse adresse, String societe) {
		super( nom, prenom, adresse);
		this.societe = societe;
	}

	@Override
	public String toString() {
		return "Fournisseur [societe=" + societe + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + "]";
	}

	public Fournisseur() {
		
	}
	
}
