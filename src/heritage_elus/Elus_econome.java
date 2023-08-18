package heritage_elus;

public class Elus_econome extends Elus {

	Elus_econome(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dotation() {
		this.compteBancaire = this.compteBancaire-(nbrAssistant*1480) ;
		super.dotation();
	}

}
