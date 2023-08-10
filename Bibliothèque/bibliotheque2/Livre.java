package bibliotheque2;

import utilitaires.Input;

public class Livre {

	String auteur;
	String nom ;  
	int isbn ;
	String collection ;
	boolean dispo ;
	int x ;
	
	
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
	
	public void recherche() {
		
		boolean d = false ;
		
				if (d == false) {
				Input.print("Ce livre n'est pas dans notre bibliothèque. Désolé.");
				}
				else if (d == true) {
					Input.print("Le livre " + src + " est dans notre bibliothèque.");
				}
	}

	
	public Livre ajouter() {
		
		Input.nextLine();
		Input.print("Veuillez indiquer le Nom :") ;
		this.nom = Input.nextLine();
		
		Input.print("Veuillez indiquer l'Auteur :");
		this.auteur = Input.nextLine();
		
		Input.print("Veuillez indiquer si vous souhaitez le conserver");
		this.dispo = Input.nextBoolean();
		
		return this;
	}
	
	public Livre ajoutisbn() {
		Input.nextLine();
		Input.print("Veuillez indiquer son numéro ISBN :");
		this.isbn = Input.nextInt();
		return this;
		
		}
	
	public Livre ajoutcollection() {
		Input.nextLine();
		Input.print("Veuillez indiquer sa collection");
		this.collection = Input.nextLine();
		return this;
	}
}
