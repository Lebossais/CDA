package exercices;

import utilitaires.Input;

public class Factorielle {

	


	public static void start() {
	int mat[][] = new int [2][99] ;
	int indiceColonne = 0 ;
		
	
	while (indiceColonne < mat[0].length-1) {
		mat[0][indiceColonne]=indiceColonne+1 ;
		indiceColonne=indiceColonne+1 ;
	}
	
	indiceColonne = 0 ;
	
	while ( indiceColonne < mat[0].length-1) {
		mat[1][indiceColonne] = CalculFactorielle(indiceColonne+1) ;
		indiceColonne=indiceColonne+1 ;
	}

	Input.print("Pour quelle valeur souhaitez-vous calculer ?") ;
	int v = Input.nextInt() ;
	
	Input.print("La factorielle de "+ v + " est " + mat[1][v-1] + ".") ;
	Input.close();
	
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
