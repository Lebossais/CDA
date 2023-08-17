package heritage_employe;

import utilitaires.Input;

public class Appel {

	public static void main (String[] args) {
		
		
		Appel appel = new Appel();
		appel.start();		
		
	}
	
	private void start() {
		
		Technicien technicien1 = new Technicien(); 
		Employe employe1 = new Employe();
	
		Input.print("Nouvel Employé");
		employe1.employe();
		System.out.println(employe1);
		employe1.augmentation();
		System.out.println(employe1);
		Input.print("---------------");
		
		Input.print("Nouveau Technicien");
		Input.nextLine();
		technicien1.technicien();
		System.out.println(technicien1);
		technicien1.augmentation();
		System.out.println(technicien1);
		Input.print("---------------");
		
	}
	
}
