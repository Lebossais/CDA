package PrincipesEncapsulation;

import utilitaires.Input;

public class Personne {
	
	private String prenom ;
	private String name ;
	private int age ;
	private int telephone;
	private Adresse adresse;
	private String Email;

	public Personne(String prenom, String name, int age, Adresse adresse, int telephone, String Email) {
		this.prenom = prenom ;
		this.name = name ;
		this.age = age ;
		this.adresse = adresse;
	}
	
	public String toString() {
		return prenom +" "+ name +" "+ age +"ans, habite au " + adresse + telephone + Email;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse ;
	}
	
	
	public void afficher() {
		Input.print(toString());
	}
}
