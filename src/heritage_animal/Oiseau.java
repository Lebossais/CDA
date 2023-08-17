package heritage_animal;

import utilitaires.Input;

public class Oiseau extends Animal {
	
	int nombreDePlumes ;
	
	public Oiseau(String nom, String espece, int age, int nombreDePlumes) {
		super(nom, espece, age);
		this.nombreDePlumes = nombreDePlumes;
		
	}
	
	
	public void senvoler() {
		Input.print("Je vole");
	}
	
	public void manger(String nourriture) {
		Input.print("Je ne mange que " + nourriture + ".");
	}
	
	@Override
	public void dormir() {
		Input.print("Je dors dans un nid");
		
	
	}

	@Override
	public String toString() {
		String a = super.toString();
		return a + "et j'ai " + nombreDePlumes + " plumes.";
	}

}
