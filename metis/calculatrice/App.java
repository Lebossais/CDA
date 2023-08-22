package calculatrice;

import java.util.Scanner;

public class App {
	

		private static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println("Hello World");

			App app = new App();
			app.start();
		}
	
		
		private void start() {

		
			tp1_1_Calculatrice();
			
		};
	
	
	private void tp1_1_Calculatrice() {
		boolean autreCalcul = true;
		String valeurString = "";
		String reponse = "";
		int valeurInteger = 0;
		long resultatFactorielle = 0;

		System.out.println("------1------");

		try {

			/*
			 * méthode printf : impression avec formatage syntaxe printf(format, arguments)
			 * printf(locale, format, arguments)
			 * %[flags][width][.precision]conversion-character s – formate les chaînes d -
			 * formate les entiers décimaux f - formate les nombres à virgule flottante t –
			 * formate les valeurs de date / heure
			 */

			System.out.printf("1 + 2 = %2.2f %n", Calculatrice.calculer('+', 1, 2));
		} catch (MyException me) {
			me.printStackTrace();
			System.out.println(me.getMessage());
		}

		System.out.println("------2------");

		try {
			System.out.printf("2078 - 64 = %2.2f %n", Calculatrice.calculer('-', 2078, 64));
		} catch (MyException me) {
			System.out.println(me.getMessage());
		}

		System.out.println("------3------");

		try {
			System.out.printf("15 * 3 = %2.2f %n", Calculatrice.calculer('*', 15, 3));
		} catch (MyException me) {
			System.out.println(me.getMessage());
		}

		System.out.println("------4------");

		try {
			System.out.printf("15 / 0 = %2.2f %n", Calculatrice.calculer('/', 15, 0));
		} catch (MyException me) {
			me.printStackTrace();
			System.out.println(me.getMessage());
		}

		System.out.println("------5------");

		try {
			System.out.printf("1 ! 2 = %2.2f %n", Calculatrice.calculer('!', 1, 2));
		} catch (MyException me) {
			System.out.println(me.getMessage());
		}

		System.out.println("------6------");

		while (autreCalcul) {
			valeurString = scan.nextLine();
			try {
				valeurInteger = Integer.parseInt(valeurString);
				resultatFactorielle = Calculatrice.factorielle(valeurInteger);
				System.out.printf("La factorielle de %d est %d %n", valeurInteger, resultatFactorielle);
			} catch (NumberFormatException nfe) {
				System.out.println("Veuillez entrer un entier SVP ");
			} catch (MyException me) {
				System.out.println(me.getMessage());
			} finally {
				System.out.println("Souhaitez-vous un autre calcul ? (oui/non) ");
				reponse = scan.nextLine();
				if (reponse.equals("non")) {
					System.out.println("Merci et au revoir");
					autreCalcul = false;
				}
			}
		}
	}


}
