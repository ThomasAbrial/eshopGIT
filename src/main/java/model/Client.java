package model;

import java.time.LocalDate;

public class Client extends Personne{
	
	private int age;
	private LocalDate date_de_naissance;
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
	public Client() {
	}
	
	
	
	
}
