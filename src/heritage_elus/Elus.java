package heritage_elus;

import utilitaires.Input;

public class Elus {


	String nom, prenom;
	int compteBancaire; // montant de son compte en euros
	int nbrAssistant;
	
	
	
	Elus(String nom, String prenom){
	this.nom = nom; this.prenom = prenom;
	this.compteBancaire = 0;
	}
	
	
	void addSous(int montant){
	this.compteBancaire = this.compteBancaire+montant;
	}
	
	
	
	
	public void embaucher() {

		Assistant assistant = new Assistant(prenom, nom);
		assistant.embaucher();
		
	}
	
	public void licencier() {
		
	}
	
	public void dotation() {
		this.compteBancaire = this.compteBancaire/nbrAssistant ;
		Input.print("Chaque assistant aura :" + this.compteBancaire );
	}
}
