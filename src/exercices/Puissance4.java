package exercices;

import utilitaires.Input ;

public class Puissance4 {

	public static void start() {
			
			int a ;
			int b ;
			char puissance4[][] = new char [6][7] ;
			
			for (a = 0 ; a < puissance4.length ; a++) {
				for (b = 0 ; b < puissance4[a].length ; b ++) {
					puissance4[a][b] = '.' ; 
				}
			}
			
			int turn = 1;
			char player = 'X' ;
			boolean winner = false ;
			
			while (winner == false  && turn <= 42) {
				boolean choixValide = false ;
				int choix ;
				
				do{ 
					afficher(puissance4);
					
					Input.print("Joueur " + player + ". A vous de jouer ! Choisissez une colonne !") ;
					choix = Input.nextInt() ;
					choixValide = valide(choix, puissance4);
					
				}while (choixValide == false);
			
			//mettre le jeton dans la grille
			for (int c = puissance4.length-1 ; c >= 0 ; c--) {
					if(puissance4[c][choix] == '.') {
						puissance4[c][choix] = player ;
						break ;
					}		
			}
			
			winner = checkWinner(player,puissance4);
			
			if (winner) {
				if (player == 'O') {
					Input.print("Le Joueur O à gagner");
					afficher(puissance4);
				} else {
					Input.print("Le joueur X à gagner");
					afficher(puissance4);
				} 
			} else {
					Input.print("Egalité");
					afficher(puissance4);
				}
			
			// Changer de joueur pour les jetons
			if (player == 'X') {
					player = 'O' ;
			} else {
				player = 'X' ;
			}
			turn++;
				
			}	
			}
	
	public static void afficher(char[][] puissance4) {
		int a;
		int b;
		
		Input.print(" 0 1 2 3 4 5 6 ");
		Input.print("----------------");
		for (a = 0 ; a < puissance4.length ; a++) {
			Input.printo("|");
			for (b = 0 ; b < puissance4[0].length ; b ++) {
				Input.printo(puissance4[a][b]) ;
				Input.printo("|");
			}
			Input.print("");
			
		}
		Input.print("----------------");
		Input.print(" 0 1 2 3 4 5 6");
		Input.print("----------------");
	}

	public static boolean valide(int a, char[][] puissance4) {
		if (a < 0 || a > puissance4.length) {
			return false ;
		}
		if (puissance4[0][a] != '.') {
			return false ;
		}
		return true;
	}
	
	public static boolean checkWinner(char player, char [][] puissance4) {
		
		//Première condition de victoire (Ligne)
		for (int a = 0; a < puissance4.length - 3 ; a++) {
			for (int b = 0 ; b < puissance4[a].length ; b++) {
				if (puissance4[a][b] == player &&
					puissance4[a+1][b] == player &&
					puissance4[a+2][b] == player &&
					puissance4[a+3][b] == player) {
					return true ;
				}
			}
		}
		//Deuxième condition de victoire (Colonne)
		for (int a = 0; a < puissance4.length ; a++) {
			for (int b = 0 ; b < puissance4[a].length - 3 ; b++) {
				if (puissance4[a][b] == player &&
					puissance4[a][b+1] == player &&
					puissance4[a][b+2] == player &&
					puissance4[a][b+3] == player) {
					return true ;
				}
			}
		}
		//Troisième condition de victoire (Diagnoale montante)
		for (int a = 3 ; a < puissance4.length ; a++) {
			for (int b = 0 ; b < puissance4[a].length - 3 ; b++) {
				if (puissance4[a][b] == player &&
					puissance4[a-1][b+1] == player &&
					puissance4[a-2][b+2] == player &&
					puissance4[a-3][b+3] == player) {
					return true ;
				}
			}
		}
		//Troisième condition de victoire (Diagnoale descandante)
		for (int a = 0; a < puissance4.length - 3 ; a++) {
			for (int b = 0 ; b < puissance4[a].length - 3 ; b++) {
				if (puissance4[a][b] == player &&
					puissance4[a+1][b+1] == player &&
					puissance4[a+2][b+2] == player &&
					puissance4[a+3][b+3] == player) {
					return true ;
				}
			}
		}
		return false;
	}
}