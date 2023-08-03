package exercices;

import java.util.Scanner;

public class Factorielle {

	


	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int mat[][] = new int [2][99] ;
	int indiceColonne = 0 ;
	int x ;
		
	
	while (indiceColonne < mat[0].length-1) {
		mat[0][indiceColonne]=indiceColonne+1 ;
		indiceColonne=indiceColonne+1 ;
	}
	
	indiceColonne = 0 ;
	
	while ( indiceColonne < mat[0].length-1) {
		mat[1][indiceColonne] = CalculFactorielle(indiceColonne+1) ;
		indiceColonne=indiceColonne+1 ;
	}

	System.out.println("Pour quelle valeur souhaitez-vous calculer ?") ;
	int v = scan.nextInt() ;
	
	System.out.println("La factorielle de "+ v + " est " + mat[1][v-1] + ".") ;
	scan.close();
	
	}
	
	private static int CalculFactorielle(int x) {
		
		int i = 1 ;
		int v ;
			for ( v=1 ; v <= x ; v++ ) {
				i=i*v ;
			}
		return i;
	
		}
}
