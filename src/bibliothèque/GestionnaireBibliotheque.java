package bibliothèque;

import utilitaires.Input;

public class GestionnaireBibliotheque {

	public static Livre ajout() {
		Livre livre = new Livre () ;
		
		Input.nextLine();
		Input.print("Veuillez indiquer le Nom :") ;
		livre.nom = Input.nextLine();
		
		Input.print("Veuillez indiquer l'Auteur :");
		livre.auteur = Input.nextLine();
		
		Input.print("Veuillez indiquer son numéro ISBN :");
		livre.ISBN = Input.nextInt();
		
		Input.print("Veuillez indiquer si vous souhaitez le conserver");
		Livre.dispo = Input.nextBoolean();
		
		return livre ;
		
	}
	
	public static void liste() {
		
		Input.print("Voici la liste complète des livre présent dans notre bibliothèque :");
		Livre.liste() ;

	}
}
