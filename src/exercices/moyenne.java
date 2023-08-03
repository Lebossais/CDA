package exercices;

import java.util.Arrays;

import utilitaires.Input;

public class Moyenne {

	public static void start() {
		
		//Scanner scan = new Scanner(System.in);
		int a = 0 ;
		int n = 0 ;
		int v = 0 ;
		
		int [] tab = new int [9] ; 		//Déclaration d'un tableau 1D
		
		do {
		Input.print("Ecrivez un chiffre:");
		int x = Input.nextInt() ;
		tab[a] = x ;
		a = a+1 ;
		} while (a !=9);
		
		
		Input.close() ;
		Input.print(Arrays.toString(tab));
		
		
		for ( n = 0 ; n < tab.length ; n++) {
		v = v+tab[n];
		}
		v= v / tab.length;
		Input.print("La valeur médiane de vos données est " + v +".");
		
	}
	
}