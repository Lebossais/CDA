package PrincipesEncapsulation;

import utilitaires.Input;

public class Personne {
	
	private String prenom ;
	private String name ;
	private int age ;
	private Adresse adresse;

	public Personne(String prenom, String name, int age, Adresse adresse) {
		this.prenom = prenom ;
		this.name = name ;
		this.age = age ;
		this.adresse = adresse;
	}
	
	public String toString() {
		return prenom +" "+ name +" "+ age +"ans, habite au " + adresse;
		
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse ;
		
	}
	
	public void afficher() {
		Input.print(toString());
	}
}
