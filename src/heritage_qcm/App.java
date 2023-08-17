package heritage_qcm;

import utilitaires.Input;

public class App {

	public static void main(String[] args) {
		
		
		App app = new App();
		app.start();		
		
	}
	
	public void start() {
		
		Question q = new Question();
		
		q.difficulteMoyenne();
		Input.print("--------------");
		q.afficher();
		Input.print("Vous avez fini le QCM !");
		
	}
}
