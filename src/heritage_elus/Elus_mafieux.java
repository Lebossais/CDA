package heritage_elus;

public class Elus_mafieux extends Elus {

	Elus_mafieux(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void embaucher() {
		Assistant assistant = new Assistant(prenom, Elus_mafieux.this.nom);
		assistant.embaucher();
		nbrAssistant = nbrAssistant + 1;
		super.embaucher();
	}
	

}
