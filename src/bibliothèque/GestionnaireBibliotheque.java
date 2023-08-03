package bibliothèque;

import utilitaires.Input;

public class GestionnaireBibliotheque {

	public static void ajout() {
		Livre.ajout();
		boolean d ;
		
		Input.print("Veuillez indiquer le Nom :") ;
		String a = Input.nextLine() ;
		
		Input.print("Veuillez indiquer l'Auteur :");
		String b = Input.nextLine();
		
		Input.print("Veuillez indiquer son numéro ISBN :");
		int c = Input.nextInt();
		
		Input.print("Veuillez indiquer si vous souhaitez le conserver");
		d = Input.nextBoolean();
		
		String Name = a ;
		String Author = b ;
		int ISBN = c ;
	}
	
	
	public static void recherche() {
		
		Input.print("Veuillez indiquer quel livre vous chercher :");
		String v = Input.nextLine() ;
		for (int i = 0 ; i < tab.length; i++) {
			for(int j = 0 ; j < tab.length; j++) {
				
				Input.print(tab[i][j] + "\t");
			}
		}
	}
	public static void liste() {

	}
}
