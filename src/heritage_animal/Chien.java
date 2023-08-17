package heritage_animal;

import utilitaires.Input;

public class Chien extends Animal {

	String race ;
	
	public Chien(String nom, String espece, int age, String race) {
		super(nom, espece, age);
		this.race = race;
	}

	public void aboyer() {
		Input.print("J'aboie");
	}
	
	public void dormir() {
		Input.print("Je dors dans une niche");
	}
	
	
	@Override
	public String toString() {
		String a = super.toString();
		return a + "et je suis de race " + race;
	}

}
