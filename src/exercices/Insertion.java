package exercices;

import java.util.Arrays;
import utilitaires.Input;

public class Insertion {

public static void start() {
		
		int a = 0 ;
		int j = 0 ;
		int v = 0 ;
		int i ;
		int k ;
		
		int [] tab = new int [9] ; 		//Déclaration d'un tableau 1D
		
		do {
		Input.print("Ecrivez un chiffre:");
		int x = Input.nextInt() ;
		tab[a] = x ;
		a = a+1 ;
		} while (a !=9);
	
		Input.close();
		Input.print(Arrays.toString(tab));
		
		v = tab.length-1 ;
		
		while (j <= v-1) {
			i = j ;
			k = tab[j+1] ;
				while (i >= 0 && tab[i]>k) {
					tab[i+1]=tab[i];
					i=i-1;
				}
			tab[i+1]=k ;
			j=j+1;			
		}
		Input.print(Arrays.toString(tab));
	}
}
