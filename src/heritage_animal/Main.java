package heritage_animal;

import utilitaires.Input;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
		
		
	}

	private void start() {
		
		
	//	Animal a = new Animal(); (Impossible d'instancier car c'est Abstract)
		Chien c = new Chien("Newton", "Chien", 8, "Berger Allemand");
		Oiseau o = new Oiseau("Roucoul", "Oiseau", 2, 576);
		
		System.out.println(c);
		c.manger(" des croquettes");
		c.dormir();
		c.aboyer();
		Input.print("-----------");
		
		System.out.println(o);
		o.manger("des graines");
		o.dormir();
		o.senvoler();
		Input.print("-----------");
	}
	
}
