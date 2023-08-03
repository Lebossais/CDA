package exercices;

import java.util.Scanner;

public class Entierpositif {
		
	int x ; // Sans affectation
	int n = 0 ;// Avec affectation
	
 public static void main(String[] args) { 
	
	Scanner scan = new Scanner(System.in);
	System.out.print("saisie un entier positif : ");
	int x = scan.nextInt();

	scan.close();
	
	for (int n = 0; n <= x ; n++) { 		//Initialisation ; Terminaison ; increment) { 
	 if (n%2<=0) {
		 System.out.println(n);
	 }
	}
 }
}
