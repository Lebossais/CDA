package heritage_animal;

import java.util.InputMismatchException;

import utilitaires.Input;

public class Main {
	
	int d1=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		try {
			app.start();
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private void start() throws InputMismatchException {
		
		Input.print("Que voulez-vous rentrer comme Animal ? \n 1] Un Chien \n 2] Un Oiseau \n 3] Arrêter");
		int x = Input.nextInt();
		switch (x) {
			case 1 :
				Input.nextLine();
				Input.print("Saisir son nom");
				String a = Input.nextLine();
				Input.print("Saisir son espèce");
				String b = Input.nextLine();
				Input.print("Saisir son âge");
				int  c = Input.nextInt();
				Input.print("Saisir sa race");
				String d = Input.nextLine();
				Chien ch = new Chien(a, b, c ,d);
				break;
			case 2 :
				Input.nextLine();
				Input.print("Saisir son nom");
				String a1 = Input.nextLine();
				Input.print("Saisir son espèce");
				String b1 = Input.nextLine();
				Input.print("Saisir son âge");
				int  c1 = Input.nextInt();
				
				try {
					Input.print("Saisir son nombre de plumes:");
					d1 = Input.nextInt();
				} catch (InputMismatchException e) { 
					throw new InputMismatchException("erreur de saisie"); 
				}
				Oiseau oi = new Oiseau(a1, b1, c1, d1);
				System.out.println(oi);
				break;
			case 3 :
				Input.print("Arrêt de l'exercice");
				break;
		}
		
		
	//	Animal a = new Animal(); (Impossible d'instancier car c'est Abstract)
//		Chien c = new Chien("Newton", "Chien", 8, "Berger Allemand");
//		Oiseau o = new Oiseau("Roucoul", "Oiseau", 2, 576);
//		
//		System.out.println(c);
//		c.manger(" des croquettes");
//		c.dormir();
//		c.aboyer();
//		Input.print("-----------");
//		
//		System.out.println(o);
//		o.manger("des graines");
//		o.dormir();
//		o.senvoler();
//		Input.print("-----------");
	}
	
}
