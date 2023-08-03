package exercices;

import java.util.Scanner;

public class Pdt {

	static int panier = 3; // Avec affectation
	static int aller; // Sans affectation
	int x; // Sans affectation
		
	
 public static void main(String[] args) { 

	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("saisie un entier : ");
	int x = scan.nextInt();

	scan.close();
	
	do {
		aller = x/panier ;
		if (x%panier != 0) {
			aller = aller+1 ;	
			}
	} while (aller == 0) ;
	
	System.out.println("Il faudra " + aller + " allers-retours pour aller chercher toutes les pommes de terres.");
}
}