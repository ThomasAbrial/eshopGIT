package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	
	@Column(name="number",length = 10 ,nullable = false)
	private String numero;
	@Column(name="street",length = 40 ,nullable = false)
	private String voie;
	@Column(name="zipcode",length = 10 ,nullable = false)
	private String cp;
	@Column(name="city",length = 40 ,nullable = false)
	private String ville;
	
	
	//--------------------Getter/Setter-----------------
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	//--------------------String-----------------
	
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", voie=" + voie + ", cp=" + cp + ", ville=" + ville + "]";
	}
	
	//--------------------Constructeur-----------------
	
	public Adresse(String numero, String voie, String cp, String ville) {
		
		this.numero = numero;
		this.voie = voie;
		this.cp = cp;
		this.ville = ville;
	}
	
	public Adresse() {}
	
	
	
}
