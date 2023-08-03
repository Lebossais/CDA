package exercices;

import java.util.Scanner; 

public class Equation {
	
	public static void main(String[] args) {
		
		int a ;
		int b ;
		int c ;
		int delta ;
		int resultat ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ecrivez un chiffre pour a :");
		a = scan.nextInt() ;
		System.out.print("Ecrivez un chiffre pour b :");
		b = scan.nextInt() ;
		System.out.print("Ecrivez un chiffre pour c :");
		c = scan.nextInt() ;
		
		
		delta = (b*b)-(4*a*c) ;
			if (delta < 0) {
				System.out.println("Il n'y a pas de solution pour cette équation.") ;
			}
				else if (delta == 0) {
					resultat =-b/(2*a) ;
					System.out.println("Il y a une solution double pour cette équation :" + resultat + ".");
				}
					else { 
						System.out.println("Il y a deux solutions pour cette équation") ;
						System.out.println(-b+(Math.sqrt(delta/2*a)));
						System.out.println(-b-(Math.sqrt(delta/2*a)));		
			}
		
		scan.close();
	}

}
