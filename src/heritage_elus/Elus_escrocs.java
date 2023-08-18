package heritage_elus;

public class Elus_escrocs extends Elus {

	private int compteSuisse;

	Elus_escrocs(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dotation() {
		this.compteBancaire = this.compteBancaire-(nbrAssistant*1480) ;
		this.compteSuisse = this.compteBancaire;
		this.compteBancaire = 0 ;
		super.dotation();
	}

	
}
