package forum;

import forum.CategorieUtilisateurr.accessibilite;

public class Utilisateur {

	String prenom ;
	String nom ;
	accessibilite statut ;
	

	public Utilisateur(String prenom, String nom, accessibilite statut) {
		this.prenom = prenom ;
		this.nom = nom ;
		this.statut = statut ;
	}
	public String toString() {
		 return "Utilisateur :"+ prenom + " " + nom + "," + statut ;
	}
}


