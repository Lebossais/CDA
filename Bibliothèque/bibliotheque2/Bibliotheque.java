package bibliotheque2;

import utilitaires.Input;

public class Bibliotheque {
	static int x = 0;

	public static void main(String[] args) {

		Input.print("Bienvenue à la Bibliothèque virtuelle");
		Input.print("--------------------");

		Employe.liste();
		Input.print("--------------------");

		Client.check();
		Input.print("--------------------");

		do {
			Input.print("Que souhaitez vous faire au sein de la bibliothèque ?");
			Input.print(
					"Vous pouvez : \n 1] Rechercher un livre \n 2] Avoir la liste complète des livres \n 3] Ajouter un livre \n 4] Emprunter un livre \n 5] Rendre un livre \n 6] Vérifier votre profil");
			x = Input.nextInt();

			int y;
			switch (x) {

			case 1:
				Livre.recherche();
				break;

			case 2:
				GestionnaireBibliotheque.liste();
				break;

			case 3:
				Input.print("Que souhaitez vous ajouter ? \n 1] Un Roman \n 2] Une BD");
				y = Input.nextInt();
					switch (y) {
						case 1 : 
							Roman roman = new Roman();
							roman.ajout();
							break;
						case 2 :
							BD bd = new BD();
							bd.ajout();
							break;
				}
				break;

			case 4:
				Input.print("Quel livre souhaitez-vous emprunter ?");
				Livre.emprunt();
				break;

			case 5:
				Input.print("Quel livre voulez vous rendre ? (ISBN)");
				Livre.rendre();
				break;

			case 6:
				Input.print("Nous allons vous aider à modifier votre profil.");
				// modification
				break;

			case 10:
				Input.print("Passez une bonne journée ! Au revoir !");

			default:
				Input.print("Réessayer avec une valeur valide.");
				break;

			}
		} while (x != 10);
	}
}
