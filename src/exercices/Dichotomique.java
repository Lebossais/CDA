package exercices;

import java.util.Arrays;

import utilitaires.Input;

public class Dichotomique {

	public static void start() {
		
		int a = 0;
		int position ;
		int tab[] = new int [10] ; // Doit être préalablement trié
		
		
		do {
			Input.print("Ecrivez un chiffre:");
			int x = Input.nextInt() ;
			tab[a] = x ;
			a = a+1 ;
			} while (a !=10);
		
		Input.print(Arrays.toString(tab));
		
		Input.print("Veuillez saisir la valeur à rechercher dans le tableau :");
		int x1 = Input.nextInt() ;
		
		
		position = recherche(tab, x1) ;
		if (position == -1) {
			Input.print("La valeur recherchée n'est pas dans le tableau");
		}
			else {
				Input.print("Votre valeur se trouve à la position " + position + " dans le tableau") ;
		}
		
		Input.close();
	}
	
	private static int recherche(int[] tab, int x) {

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