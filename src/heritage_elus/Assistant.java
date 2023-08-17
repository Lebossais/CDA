package heritage_elus;

import utilitaires.Input;

public class Assistant {

	String nom, prenom;
	int compteBancaire; // montant de son compte en euros
	
	Assistant(String nom, String prenom){
		this.nom = nom; this.prenom = prenom;
	}
	
	
	public void embaucher() {
		
		Input.print("Indiquer son prénom");
		String a = Input.nextLine();
		a = this.prenom;
		Input.print("Indiquer son nom");
		String b = Input.nextLine();
		b = this.nom;
	}
	
}
