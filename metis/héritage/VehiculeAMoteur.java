package héritage;

public abstract class VehiculeAMoteur extends Vehicule {


	public VehiculeAMoteur(String marque, String modele) {
		super(marque, modele);
		// TODO Auto-generated constructor stub
	}

	Moteur moteur = new Moteur(0, 0, false);
	

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public boolean demarrer() {
		return moteur.demarrer();
	}
	
	public void arreter() {
		moteur.arreter();
	}
	
	public void faireLePlein(int carburant) {
		arreter();
		moteur.faireLePlein(carburant);
		demarrer();
		
	}
}
