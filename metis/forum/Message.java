package forum;

import java.text.DateFormat;
import java.util.Date ;

import utilitaires.Input;

public class Message {

	String titre ;
	String texte ;
	Date dateCreation ;
	Utilisateur utilisateur ;
	public String message;

	public Message(String titre, String texte, Utilisateur nom) {
		this.titre = titre ;
		this.texte = texte ;
		this.utilisateur = nom ;
		this.dateCreation = new Date();
	}
	public String getDateCreation() {
		 DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		 return df.format(dateCreation);
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public String toString() {
		 return titre + " -- " + texte + "\nDate de création : " + getDateCreation() + "\n" + utilisateur ;
	}
	
	public void afficher() {
		Input.print(toString());
	}
	
public static void main(String[] args) {
		
		Message.ajouterUtilisateurMessages();
		
	}
public static Message ajouterUtilisateurMessages() {
	Utilisateur Jean = new Utilisateur("Jean", "Dupont", CategorieUtilisateurr.accessibilite.STANDARD);
	Utilisateur Bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateurr.accessibilite.STANDARD);
	Utilisateur Nathalie = new Utilisateur("Nathalie", "Morin", CategorieUtilisateurr.accessibilite.MODERATEUR);

//	Forum.ajouterUtilisateurMessages();
	Message message1 = new Message (" Java SE","L'encapsulation est une propriété fondamentale", Jean);
	
	message1.afficher();
	return message1;
}
}