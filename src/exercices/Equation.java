package exercices;

import utilitaires.Input; 

public class Equation {
	
	public static void start() {
		
		int a ;
		int b ;
		int c ;
		int delta ;
		int resultat ;
		
		Input.print("Ecrivez un chiffre pour a :");
		a = Input.nextInt() ;
		Input.print("Ecrivez un chiffre pour b :");
		b = Input.nextInt() ;
		Input.print("Ecrivez un chiffre pour c :");
		c = Input.nextInt() ;
		
		
		delta = (b*b)-(4*a*c) ;
			if (delta < 0) {
				Input.print("Il n'y a pas de solution pour cette équation.") ;
			}
				else if (delta == 0) {
					resultat =-b/(2*a) ;
					Input.print("Il y a une solution double pour cette équation :" + resultat + ".");
				}
					else { 
						Input.print("Il y a deux solutions pour cette équation") ;
						Input.print(-b+(Math.sqrt(delta/2*a)));
						Input.print(-b-(Math.sqrt(delta/2*a)));		
			}
	}

}
