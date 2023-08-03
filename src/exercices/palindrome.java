package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ; 
		int n ;
		int n1 ;
		int v ;
		boolean palindrome ;
			
			System.out.print("Ecrivez des caractères:");
			int x = scan.nextInt() ;
			String[] tab = new String[x] ;

	
		System.out.println(Arrays.toString(tab));
		
		System.out.println("Quelle lettre voulez-vous compter ?") ;
		int b = scan.nextInt() ;
		
		v = tab.length ;
		
		for (i=1 ; v ; i++) {
			if (tab[i] == b ) {
				n = n+1 ;
			}
		System.out.println("Il y a " + n + b + "dans cette chaine de caractères") ;	
		}
	}
}
