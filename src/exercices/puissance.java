package exercices;

import java.util.Scanner;

public class puissance {
	
	public static void main(String[] args) {
		
		int x ;
		int y ;
		int resultat ;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Saisir la valeur de x");
		x = scan.nextInt();
		System.out.print("Saisir la valeur de y");
		y = scan.nextInt();
		
		
		if (y == 0) {
			System.out.println("Le résultat est 1.");
		}
		else if (x == 0) {
			System.out.println("Le résultat est 0.");
		}
			else {
				resultat = (int) (Math.pow(x,y)) ;
						System.out.println("Le résultat est " + resultat );
			}
		scan.close();
		}
	}

