package exercices;

import java.util.Scanner;

public class senseo {
		
	
	
	public static void main(String[] args) { 
		
		 int eau_reservoir=300 ; // Avec affectation
		 int eau_tasse=100 ; 	// Avec affectation
		 int marc_cafe=0 ;		// Avec affectation
		 boolean x ;
		 Scanner scan = new Scanner(System.in);
	
		do {
			
			do {
				
				System.out.println("Souhaitez vous un café ?");
				x = scan.nextBoolean();
					if ( x == true) {
						eau_reservoir = eau_reservoir-eau_tasse ;
						marc_cafe=marc_cafe+50 ;
						System.out.println("Votre café est prêt");
					}	
						else if (x == false) {
							System.out.println("Très bien, pas de café.");
					}
				
			}while (eau_reservoir > 0 && marc_cafe < 150 && x == true )  ;
			
			if( eau_reservoir == 0 ) {
				System.out.println("Souhaitez vous remettre de l'eau ?");
				x = scan.nextBoolean();
					if (x == true) {
						eau_reservoir=eau_reservoir+300 ;
						System.out.println("Vous avez remis de l'eau.");
					}
						else if ( x == false) {
						System.out.println("Très bien. Vous pourriez penser tout de même au prochain !") ;
					}
			if (marc_cafe == 150) {
				System.out.println("Souhaitez vous remettre enlever le marc de café ?");
				x = scan.nextBoolean();
					if ( x == true ) {
						marc_cafe=marc_cafe-150 ;
						System.out.println("Vous avez enlever la marc de café.");
					}
					else if ( x == false ) {
						System.out.println("Très bien. Vous pourriez tout de même penser au prochain !");
					}
			}
				
			}
				
		}while(x != false) ;
		
		scan.close();
		System.out.println("Senseo vous souhaite une bonne journée !");
	}
	
}                                                                                                                                                                                                                                                                                                                           