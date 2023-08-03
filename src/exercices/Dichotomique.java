package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Dichotomique {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int position ;
		int resultat ;
		int tab[] = new int [10] ; // Doit être préalablement trié
		
		
		do {
			System.out.print("Ecrivez un chiffre:");
			int x = scan.nextInt() ;
			tab[a] = x ;
			a = a+1 ;
			} while (a !=10);
		
		System.out.println(Arrays.toString(tab));
		
		System.out.print("Veuillez saisir la valeur à rechercher dans le tableau :");
		int x1 = scan.nextInt() ;
		
		
		position = recherche(tab, x1) ;
		if (position == -1) {
			System.out.println("La valeur recherchée n'est pas dans le tableau");
		}
			else {
				System.out.println("Votre valeur se trouve à la position " + position + " dans le tableau") ;
		}
		
		scan.close();
	}
	
	private static int recherche(int[] tab, int x) {
		Scanner scan = new Scanner(System.in);
		int indiceBas = 0 ;
		int indiceHaut = tab.length-1 ;
		int indiceMilieu = (indiceBas+indiceHaut)/2;
		boolean trouve = false ;
		
		while (trouve == false && indiceBas <= indiceHaut) { 
			if (x < tab[indiceMilieu]) {
				indiceHaut = indiceMilieu-1 ;
			}
				else if (x > tab[indiceMilieu]) {
					indiceBas = indiceMilieu+1 ;
				}
				else {
					trouve = true ;	
				}
			indiceMilieu = (indiceBas + indiceHaut)/2 ;
			}
		
		if(trouve == true) {
			return (indiceMilieu+1);
		}
			else {
				return(-1) ;
			}		
		}
	}