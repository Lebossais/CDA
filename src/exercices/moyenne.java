package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class moyenne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0 ;
		int n = 0 ;
		int v = 0 ;
		
		int [] tab = new int [9] ; 		//Déclaration d'un tableau 1D
		
		do {
		System.out.print("Ecrivez un chiffre:");
		int x = scan.nextInt() ;
		tab[a] = x ;
		a = a+1 ;
		} while (a !=9);
		
		
		scan.close() ;
		System.out.println(Arrays.toString(tab));
		
		
		for ( n = 0 ; n < tab.length ; n++) {
		v = v+tab[n];
		}
		v= v / tab.length;
		System.out.println("La valeur médiane de vos données est " + v +".");
	}
	
}