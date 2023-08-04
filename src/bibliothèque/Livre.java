package bibliothèque;

import utilitaires.Input;

public class Livre {

	public String auteur;
	public String nom ;  
	public int ISBN ;
	public static boolean dispo ;
	static Livre[] tabLivre = new Livre[20] ;
	
	public static void ajout() {
		
		for (int i = 0 ; i <= 20 ; i++) {
			if (tabLivre[i] == null) {
				tabLivre[i] = GestionnaireBibliotheque.ajout();
				break ;
			}
			}
		}
		
	public static void emprunt() {	
		boolean d = false ;
		Input.nextLine();
		Input.print("Indiquer le nom s'il vous plaît.") ;
 		String src = Input.nextLine(); 
		for (int o = 0 ; o <= 19 ; o++) {
			if (tabLivre[o] == null && d == false) {
				d = false ;
			}
			else if (tabLivre[o].nom.equals(src) && tabLivre[o].dispo == true){ 
				d = true ;
				tabLivre[o].dispo = false ;
				break ;
			}
		}
		if (d == false) {
			Input.print("Le livre que vous recherchez n'est pas au sein de la bibliothèque.");
			}
			else if (d == true) {
				Input.print("Vous prenez le livre "+ src + ". Pensez à le rendre dans 3semaines !");
			}
	}	
	
	public static void rendre() {
		boolean d = false ;
		Input.nextLine();
		Input.print("Indiquer le N° ISBN s'il vous plaît.") ;
		int src = Input.nextInt();  
			for (int o = 0 ; o <= 19 ; o++) {
				if (tabLivre[o] == null && d == false) {
					d = false ;
				}
				else if (tabLivre[o].ISBN == src && tabLivre[o].dispo == false){ //passez la valeur en true
					d = true ;
					tabLivre[o].dispo = true ;
					break ;
				}
			}
			if (d == false) {
				Input.print("Désolé, ce livre n'est pas référencé au sein de notre bibliothèque.");
				}
				else if (d == true) {
					Input.print("Vous rendez le livre "+ src + ". J'espère qu'il vous a plu ");
				}
	}
	
	public static void recherche() {

		boolean d = false ;
		Input.nextLine();
		Input.print("Veuillez indiquer quel livre vous chercher :");
		String src = Input.nextLine(); 
				for (int o = 0 ; o <= 19 ; o++) {
					if (tabLivre[o] == null) {
						d = false ;
				}
				else if (tabLivre[o].nom.matches(src)){
					d = true ;
					break ;
				}
					
		}
				if (d == false) {
				Input.print("Ce livre n'est pas dans notre bibliothèque. Désolé.");
				}
				else if (d == true) {
					Input.print("Le livre " + src + " est dans notre bibliothèque.");
				}
	}
	
	public static void liste() {
		
		for (int m = 0 ; m <= 19 ; m++) {
			if (tabLivre[m] != null) {
				
			Input.print(tabLivre[m].nom);
			Input.print(tabLivre[m].auteur);
			Input.print(tabLivre[m].ISBN);
			Input.print(tabLivre[m].dispo);
			Input.print("---------------");
			}
		}
	}
}
