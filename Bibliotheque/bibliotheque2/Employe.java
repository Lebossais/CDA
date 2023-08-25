package bibliotheque2;

import java.util.ArrayList;

import utilitaires.Input;

public class Employe {

	static int x = 0;
	String prenom;
	String nom;
	String matricule;

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getMatricule() {
		return matricule;
	}

	static ArrayList<Employe> employe = new ArrayList<Employe>();

	public Employe(String prenom, String nom, String matricule) {
		this.prenom = prenom;
		this.nom = nom;
		this.matricule = matricule;
	}

	private static void Stockage() {

		Employe Nathan = new Employe("Nathan", "Valentis", "Matricule 11");
		employe.add(Nathan);
		Employe Iris = new Employe("Iris", "Arryn", "Matricule 57");
		employe.add(Iris);
		Employe Minos = new Employe("Mïnos", "Cromwell", "Matricule 66");
		employe.add(Minos);
	}

	public static void liste() {

		Employe.Stockage();
		Input.print("Qui souhaitez-vous avoir ?");
		Input.print("Aujourd'hui, Nathan[0], Iris[1] ou Mïnos[2] travaille. Qui voulez-vous avoir ? ");
		x = Input.nextInt();
		Employe str = employe.get(x);
		Input.print("Très bien," + str.getPrenom() + " " + str.getNom() + "|" + str.getMatricule()
				+ " va s'occuper de vous.");
	}
}
