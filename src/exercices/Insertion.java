package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0 ;
		int j = 0 ;
		int v = 0 ;
		int i ;
		int k ;
		
		int [] tab = new int [9] ; 		//Déclaration d'un tableau 1D
		
		do {
		System.out.print("Ecrivez un chiffre:");
		int x = scan.nextInt() ;
		tab[a] = x ;
		a = a+1 ;
		} while (a !=9);
	
		scan.close();
		System.out.println(Arrays.toString(tab));
		
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
		System.out.println(Arrays.toString(tab));
	}
}
