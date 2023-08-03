package exercices;

import utilitaires.Input;

public class puissance {
	
	public static void start() {
		
		int x ;
		int y ;
		int resultat ;
		
		
		Input.print("Saisir la valeur de x");
		x = Input.nextInt();
		Input.print("Saisir la valeur de y");
		y = Input.nextInt();
		
		
		if (y == 0) {
			Input.print("Le résultat est 1.");
		}
		else if (x == 0) {
			Input.print("Le résultat est 0.");
		}
			else {
				resultat = (int) (Math.pow(x,y)) ;
						Input.print("Le résultat est " + resultat );
			}
		Input.close();
		}
	}

