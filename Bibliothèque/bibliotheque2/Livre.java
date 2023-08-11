package bibliotheque2;

import utilitaires.Input;

public class Livre {

	String auteur;
	String nom;
	int isbn;
	String collection;
	boolean dispo;
	int x;

	public boolean emprunt(String src1, boolean d) {

		return d;
	}

	public boolean rendre(String src2, boolean a) {

		return a;
	}

	public boolean recherche(String src, boolean i) {

		return i;
	}

	public Livre ajouter() {

		Input.nextLine();
		Input.print("Veuillez indiquer le Nom :");
		this.nom = Input.nextLine();

		Input.print("Veuillez indiquer l'Auteur :");
		this.auteur = Input.nextLine();

		Input.print("Veuillez indiquer si vous souhaitez le conserver");
		this.dispo = Input.nextBoolean();

		return this;
	}

	public Livre ajoutisbn() {
		Input.nextLine();
		Input.print("Veuillez indiquer son numéro ISBN :");
		this.isbn = Input.nextInt();
		return this;

	}

	public Livre ajoutcollection() {
		Input.nextLine();
		Input.print("Veuillez indiquer sa collection");
		this.collection = Input.nextLine();
		return this;
	}
}
