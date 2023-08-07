package index;

import exercices.Moyenne;
import exercices.Dichotomique;
import exercices.Entierpositif;
import exercices.Equation;
import exercices.Factorielle;
import exercices.Insertion;
import exercices.Pdt;
import exercices.Puissance4;
import exercices.puissance;
import exercices.Senseo;

import utilitaires.Input;

public class appel {

	
		public static void main(String[] args) {
			int x =0 ;
			
		do {
			Input.print("Quel exercice voulez vous faire ?");
			x = Input.nextInt() ;
			
			
			switch(x) {
			
			case 1 : 
				Input.print("Lancement de l'exercice ''Entier positif''") ;
				Entierpositif.start();
				break ;
				
			case 2 :
				Input.print("Lancement de l'exercice ''Pomme de Terre''") ;
				Pdt.start();
				break ;
				
			case 3 :
				Input.print("Lancement de l'exercice ''Machine à café''") ;
				Senseo.start();
				break ;
				
			case 4 :
				Input.print("Lancement de l'exercice ''Calculer une moyenne''") ;
				Moyenne.start();
				break ;
				
			case 5 :
				Input.print("Lancement de l'exercice ''Calculer une puissance''") ;
				puissance.start();
				break ;
				
			case 6 :
				Input.print("Lancement de l'exercice ''Equation du second degré''") ;
				Equation.start();
				break ;
				
			case 7 :
				Input.print("Lancement de l'exercice ''Calcul d'une factorielle''") ;
				Factorielle.start();
				break ;
				
			case 8 :
				Input.print("Lancement de l'exercice ''Tri par Insertion''") ;
				Insertion.start();
				break ;
				
			case 9 :
				Input.print("Lancement de l'exercice ''Recherche par dichotomique''") ;
				Dichotomique.start();
				break ;
				
			case 10 : 
				Input.print("Lancement de l'exercice  ''Puissance 4''");
				Puissance4.start();
				break ;
				
			case 50 : 
				Input.print("Bonne journée. Au revoir.");
				break ;
				
			default :
				Input.print("Réessayez.");
			 	break;
			}
			} while ( x != 50) ;
		}
		
}