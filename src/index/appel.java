package index;

import exercices.Moyenne;
import exercices.Dichotomique;
import exercices.Entierpositif;
import exercices.Equation;
import exercices.Factorielle;
import exercices.Insertion;
import exercices.Pdt;
import exercices.puissance;
import exercices.Senseo;

import utilitaires.Input;

public class appel {

	
		public static void main(String[] args) {
			
			
			Input.print("Quel exercice voulez vous faire ?");
			int x = Input.nextInt() ;
			
			
			switch(x) {
			
			case 1 : 
				Input.print("Lancement de l'exercice ''Entier positif''") ;
				Entierpositif.start();
			
			case 2 :
				Input.print("Lancement de l'exercice ''Pomme de Terre''") ;
				Pdt.start();
			
			case 3 :
				Input.print("Lancement de l'exercice ''Machine à café''") ;
				Senseo.start();
				
			case 4 :
				Input.print("Lancement de l'exercice ''Calculer une moyenne''") ;
				Moyenne.start();
				
			case 5 :
				Input.print("Lancement de l'exercice ''Calculer une puissance''") ;
				puissance.start();
				
			case 6 :
				Input.print("Lancement de l'exercice ''Equation du second degré''") ;
				Equation.start();
				
			case 7 :
				Input.print("Lancement de l'exercice ''Calcul d'une factorielle''") ;
				Factorielle.start();
				
			case 8 :
				Input.print("Lancement de l'exercice ''Tri par Insertion''") ;
				Insertion.start();
				
			case 9 :
				Input.print("Lancement de l'exercice ''Recherche par dichotomique''") ;
				Dichotomique.start();
				
			default :
				Input.print("Choix incorrect");
			 	break;
			}
			
		}
		
}