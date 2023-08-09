package PrincipesEncapsulation;

import utilitaires.Input;

public class Personne1 {

	private String nom ;
	private String societe ;
	private static final String PAS_DE_SOCIETE = "?";
	
	public Personne1(String nom, String societe) {
		this.nom = nom.toUpperCase();
		this.societe = getSociete(societe);
		validerSociete(societe).toUpperCase();
	}
	public Personne1(String nom) {
		this.nom = nom.toUpperCase();
		societe = new String("?");
	}
	public String getNom(String nom) {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	private String getSociete(String societe) {
		return societe;
	}
	public void setSociete(String societe) {
		if (!societe.equals("?")) {
			afficher();
			Input.print("Erreur : 1 -quitterSociete, puis 2 - affecterSociete");
			System.exit(1);
		}
		validerSociete(societe).toUpperCase();
		this.societe = societe;
	}	
	public void afficher() {
		Input.printo("Je m'appelle " + nom);
		if (societe.equals("?")) {
		Input.print(" et je ne suis pas employé d'une entreprise");
		} else {
		 Input.print(" et je travaille chez " + societe) ;		
		}
	}
	public void quitterSociete() {
		if (societe.equals("?")) {
			afficher();
			Input.print("Je ne suis pas salarié : impossible de quitter la société");
			System.exit(1);
		}else {
			societe = PAS_DE_SOCIETE ;
		}
	}
	private String validerSociete(String societe) {
		if(societe.length() >= 30 || societe.equals("?")) { // || = OU
			Input.print("Classe Personne, société incorrecte :" + societe);
			System.exit(2);
		}
		return societe ; 
		
	}
}

