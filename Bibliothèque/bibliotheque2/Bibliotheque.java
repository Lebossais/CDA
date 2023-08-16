package bibliotheque2;

import utilitaires.Input;

public class Bibliotheque {
	static int x = 0;
	String src;
	static boolean d;
	static boolean a;
	static boolean i;

	public static void main(String[] args) {

		Roman roman = new Roman();
		BD bd = new BD();

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
				Input.nextLine();
				Input.print("Veuillez indiquer quel livre vous chercher :");
				String src = Input.nextLine();
				i = roman.rechercher(src);
				if (i == false) {
					Input.print("Ce livre n'est pas dans notre section ROMAN");
				} else if (i == true) {
					Input.print("Le livre " + src + " est dans notre bibliothèque à la section ROMAN.");
				}
				i = bd.rechercher(src);
				if (i == false) {
					Input.print("Ce livre n'est pas dans notre section BD.");
				} else if (i == true) {
					Input.print("Le livre " + src + " est dans notre bibliothèque à la section BD.");
				}
				break;

			case 2:
				Input.print("Voici la liste complète des livre présent dans notre bibliothèque :");
				roman.liste();
				bd.liste();
				break;

			case 3:
				Input.print("Que souhaitez vous ajouter ? \n 1] Un Roman \n 2] Une BD");
				y = Input.nextInt();
				switch (y) {
				case 1:
					roman.ajout();
					break;
				case 2:
					bd.ajout();
					break;
				}
				break;

			case 4:
				Input.print("Quel livre souhaitez-vous emprunter ?");
				Input.nextLine();
				Input.print("Indiquer le nom s'il vous plaît.");
				String src1 = Input.nextLine();
				d = roman.emprunt(src1);
				if (d == false) {
					Input.print("Le livre que vous recherchez n'est pas au sein de la section ROMAN.");
				} else if (d == true) {
					Input.print("Vous prenez le livre " + src1 + " dans la section ROMAN. Pensez à le rendre dans 3semaines !");
				}
				d = bd.emprunt(src1);
				if (d == false) {
					Input.print("Le livre que vous recherchez n'est pas au sein de la section BD.");
				} else if (d == true) {
					Input.print("Vous prenez le livre " + src1 + " dans la section BD. Pensez à le rendre dans 3semaines !");
				}
				break;

			case 5:
				Input.nextLine();
				Input.print("Indiquer le N° ISBN ou la Collection s'il vous plaît.");
				String src2 = Input.nextLine();
				a = roman.rendre(src2);
				if (a == false) {
					Input.print("Le livre que vous recherchez n'est pas au sein de la section ROMAN.");
				} else if (a == true) {
					Input.print("Vous rendez le livre " + src2 + " de la section ROMAN. Merci à vous !");
				}
				a = bd.rendre(src2);
				if (a == false) {
					Input.print("Le livre que vous recherchez n'est pas au sein de la section ROMAN.");
				} else if (a == true) {
					Input.print("Vous prenez le livre " + src2 + " de la section BD. Merci à vous !");
				}
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
