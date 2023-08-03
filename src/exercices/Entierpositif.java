package exercices;


import utilitaires.Input;

public class Entierpositif {
		
	int x ; // Sans affectation
	int n = 0 ;// Avec affectation
	
 public static void start() { 
	
	 
	Input.print("saisie un entier positif : ");
	int x = Input.nextInt();

	
	for (int n = 0; n <= x ; n++) { 		//Initialisation ; Terminaison ; increment) { 
	 if (n%2<=0) {
		 Input.print(""+n);
	 }
	}
 }
}
