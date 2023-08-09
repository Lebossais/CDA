package héritage;

import  utilitaires.Input;

public abstract class Vehicule {
	String marque;
	String modele;

	
	public Vehicule(String marque, String modele) {
		this.marque = marque;
		this.modele = modele;
	}

	public boolean demarrer(){
		Input.print("Je démarre");
		return true;
	}

	public void arreter() {
		Input.print("Je m'arrête");
	}
	
	public float faireLePlein() {
		Input.print("Je fais le plein.");
		return 0;
		
	}
	
	public void utiliser() {
		Input.print("J'utilise");
	}
	
}
//	float volume_reservoir ;
//  float volume_total ;