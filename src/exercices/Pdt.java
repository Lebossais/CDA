package exercices;

import utilitaires.Input;

public class Pdt {

	static int panier = 3; // Avec affectation
	static int aller; // Sans affectation
	int x; // Sans affectation
		
	
 public static void start() { 

	
	Input.print("saisie un entier : ");
	int x = Input.nextInt();

	
	do {
		aller = x/panier ;
		if (x%panier != 0) {
			aller = aller+1 ;	
			}
	} while (aller == 0) ;
	
	Input.print("Il faudra " + aller + " allers-retours pour aller chercher toutes les pommes de terres.");
}
}