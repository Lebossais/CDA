package héritage;

public class Voiture extends VehiculeAMoteur {
	

	public Voiture(String marque, String modele) {
		super(marque, modele);
		// TODO Auto-generated constructor stub
	}

	public void rouler( float consommation ) {
		if ( ! getMoteur().isDemarré()) {
		 getMoteur().demarrer();
		 }
		carburant = moteur.utiliser( (int) consommation );
	}
	
}
