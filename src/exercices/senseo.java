package exercices;

import utilitaires.Input;

public class Senseo {
		
	
	
	public static void start() { 
		
		 int eau_reservoir=300 ; // Avec affectation
		 int eau_tasse=100 ; 	// Avec affectation
		 int marc_cafe=0 ;		// Avec affectation
		 boolean x ;
	
		do {
			
			do {
				
				Input.print("Souhaitez vous un café ?");
				x = Input.nextBoolean();
					if ( x == true) {
						eau_reservoir = eau_reservoir-eau_tasse ;
						marc_cafe=marc_cafe+50 ;
						Input.print("Votre café est prêt");
					}	
						else if (x == false) {
							Input.print("Très bien, pas de café.");
					}
				
			}while (eau_reservoir > 0 && marc_cafe < 150 && x == true )  ;
			
			if( eau_reservoir == 0 ) {
				Input.print("Souhaitez vous remettre de l'eau ?");
				x = Input.nextBoolean();
					if (x == true) {
						eau_reservoir=eau_reservoir+300 ;
						Input.print("Vous avez remis de l'eau.");
					}
						else if ( x == false) {
						Input.print("Très bien. Vous pourriez penser tout de même au prochain !") ;
					}
			if (marc_cafe == 150) {
				Input.print("Souhaitez vous remettre enlever le marc de café ?");
				x = Input.nextBoolean();
					if ( x == true ) {
						marc_cafe=marc_cafe-150 ;
						Input.print("Vous avez enlever la marc de café.");
					}
					else if ( x == false ) {
						Input.print("Très bien. Vous pourriez tout de même penser au prochain !");
					}
			}
				
			}
				
		}while(x != false) ;
		
		Input.print("Senseo vous souhaite une bonne journée !");
	}
	
}                                                                                                                                                                                                                                                                                                                           