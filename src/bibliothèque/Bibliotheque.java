package bibliothèque;

import utilitaires.Input;

public class Bibliotheque {

	
	public static void main(String[] args) {
		
		int x = 0 ;
		Input.print("Bienvenue à la Bibliothèque virtuelle");
	do {
		Input.print("Que souhaitez vous faire au sein de la bibliothèque ?");
		Input.print("Vous pouvez : \n 1] Rechercher un livre \n 2] Avoir la liste complète des livres \n 3] Ajouter un livre \n 4] Emprunter un livre \n 5] Rendre un livre ");
		x = Input.nextInt() ;
		
		switch(x) {
			case 0 :
				Input.print("Réessayer avec une valeur valide.");
				break ;
				
			case 1 :
				Livre.recherche();
				break ;
				
			case 2 :
				GestionnaireBibliotheque.liste();
				break ;
				
			case 3 :
				Input.print("Veuillez indiquer les données suivantes : Nom | Auteur | ISBN | Disponible | pour enregistrer votre livre");
				Livre.ajout() ;
				break ;
				
			case 4 :
				Input.print("Quel livre souhaitez-vous emprunter ?");
				Livre.emprunt();
				break ;
				
			case 5 :
				Input.print("Quel livre voulez vous rendre ? (ISBN)");
				Livre.rendre();
				break ;
				
			default :
				Input.print("Vous ne souhaitez donc rien faire. Au revoir.");
				break ;
				
		}
	} while (x != 10) ;
	}
}
