package héritage;

import utilitaires.Input;

public class Moteur {
	float volume_reservoir ;
	float volume_total ;
	boolean demarré ;
	
	public Moteur(float volume_reservoir, float volume_total, boolean demarré) {
		super();
		this.volume_reservoir = volume_reservoir;
		this.volume_total = volume_total;
		this.demarré = demarré;
	}
	public float getVolume_reservoir() {
		return volume_reservoir;
	}
	public void setVolume_reservoir(float volume_reservoir) {
		this.volume_reservoir = volume_reservoir;
	}
	public float getVolume_total() {
		return volume_total;
	}
	public void setVolume_total(float volume_total) {
		this.volume_total = volume_total;
	}
	public boolean isDemarré() {
		return demarré;
	}
	public void setDemarré(boolean demarré) {
		this.demarré = demarré;
	}

	public boolean demarrer() {
		if(getVolume_reservoir()> 0) {
			setVolume_reservoir(volume_reservoir-(1/10));
			Input.print("Je réussis à démarrer. Perte de 1/10 de litre en carburant");
			return true;
		} else {
			Input.print("C'est la panne d'essence. Faut faire le plein mec.");
			return false;
		}
	}
	
	public void arreter() {
		Input.print("Je m'arrête");
	}
	
	public float faireLePlein(int carburant) {
//		getVolume_reservoir();
//		getVolume_total();
		setVolume_reservoir(getVolume_reservoir()+ carburant);
		setVolume_total(getVolume_total()+ carburant);
		Input.print("Plein effectué avec" + carburant + "litres");
		return carburant;
	}
	public float utiliser(int carburant_necessaire) {
		if(getVolume_reservoir() >= carburant_necessaire)
		Input.print("J'utilise");
		return volume_reservoir;
	}	
}
