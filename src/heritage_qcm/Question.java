package heritage_qcm;

import java.util.ArrayList;

import utilitaires.Input;

public class Question {

	String titre;
	String enonce;
	int difficulte;// la difficulte varie de 0 à 100
	int a = 0;
	int x;

	public String getTitre() {
		return titre;
	}

	void setDifficulte(int d) {
		this.difficulte = d;
	}

	int getDifficulte() {
		return difficulte;
	}

	String getEnonce() {
		return this.enonce;
	}

	public Question(String titre, int difficulte, String enonce) {
		this.titre = titre;
		this.difficulte = difficulte;
		this.enonce = enonce;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}

	static ArrayList<Question> questionFacile = new ArrayList<Question>();
	static ArrayList<Question> questionNormal = new ArrayList<Question>();
	static ArrayList<Question> questionDifficile = new ArrayList<Question>();

	public void stockage() {

		Question Question1 = new Question("Histoire", 8, " Quel date ?");
		questionFacile.add(Question1);
		Question Question2 = new Question("Géographie", 17, " Capitale ?");
		questionFacile.add(Question2);
		Question Question3 = new Question("Sport", 35, "Quel sportif ?");
		questionNormal.add(Question3);
		Question Question4 = new Question("Histoire", 58, " Quel date ?");
		questionNormal.add(Question4);
		Question Question5 = new Question("Géographie", 75, " Capitale ?");
		questionDifficile.add(Question5);
		Question Question6 = new Question("Sport", 92, "Quel sportif ?");
		questionDifficile.add(Question6);
	}

	public void difficulteMoyenne() {

		this.stockage();
		for (Question i : questionFacile) {
			i.getDifficulte();
			a = a + i.getDifficulte();
		}
		for (Question i : questionNormal) {
			a = a + i.getDifficulte();
		}
		for (Question i : questionDifficile) {
			a = a + i.getDifficulte();
		}
		a = a / (questionFacile.size() + questionNormal.size() + questionDifficile.size());

		Input.print("La valeur moyenne de la difficulte de ce QCM est de : " + a);
	}

	public void afficher() {
		this.stockage();
		Input.print(
				"Veuillez indiquer quel niveau de difficulté vous voulez effectuer : \n 1] Facile \n 2] Normal \n 3] Difficile");
		x = Input.nextInt();
		switch (x) {

		case 1:
			Input.print("Voici la première question du mode Facile !");
			Question str = questionFacile.get(1);
			System.out.println("Question : " + str.getTitre() + " | Difficulté : " + str.getDifficulte() + " | "
					+ str.getEnonce());
			Input.print(" Voici les trois choix qui s'offrent à vous : \n 1] \n 2] \n 3] ");
			x = Input.nextInt();
			switch (x) {
			case 1:
				Input.print("");
				break;
			case 2:
				Input.print("");
				break;
			case 3:
				Input.print("");
				break;
			}

			Input.print("Voici la deuxième question du mode Facile !");
			Question str1 = questionFacile.get(2);
			System.out.println("Question : " + str1.getTitre() + " | Difficulté : " + str1.getDifficulte() + " | "
					+ str1.getEnonce());
			Input.print(" Voici les trois choix qui s'offrent à vous : \n 1] \n 2] \n 3] ");
			x = Input.nextInt();
			switch (x) {
			case 1:
				Input.print("");
				break;
			case 2:
				Input.print("");
				break;
			case 3:
				Input.print("");
				break;
			}
			break;
		case 2:
			Input.print("Voici la première question du mode Normal !");
			Question str2 = questionNormal.get(1);
			System.out.println("Question : " + str2.getTitre() + " | Difficulté : " + str2.getDifficulte() + " | "
					+ str2.getEnonce());
			Input.print(" Voici les trois choix qui s'offrent à vous : \n 1] \n 2] \n 3] ");
			x = Input.nextInt();
			switch (x) {
			case 1:
				Input.print("");
				break;
			case 2:
				Input.print("");
				break;
			case 3:
				Input.print("");
				break;
			}

			Input.print("Voici la deuxième question du mode Normal !");
			Question str3 = questionNormal.get(2);
			System.out.println("Question : " + str3.getTitre() + " | Difficulté : " + str3.getDifficulte() + " | "
					+ str3.getEnonce());
			Input.print(" Voici les trois choix qui s'offrent à vous : \n 1] \n 2] \n 3] ");
			x = Input.nextInt();
			switch (x) {
			case 1:
				Input.print("");
				break;
			case 2:
				Input.print("");
				break;
			case 3:
				Input.print("");
				break;
			}
			break;
		case 3:
			Input.print("Voici la première question du mode Difficile !");
			Question str4 = questionDifficile.get(1);
			System.out.println("Question : " + str4.getTitre() + " | Difficulté : " + str4.getDifficulte() + " | "
					+ str4.getEnonce());
			Input.print(" Voici les trois choix qui s'offrent à vous : \n 1] \n 2] \n 3] ");
			x = Input.nextInt();
			switch (x) {
			case 1:
				Input.print("");
				break;
			case 2:
				Input.print("");
				break;
			case 3:
				Input.print("");
				break;
			}

			Input.print("Voici la deuxième question du mode Difficile !");
			Question str5 = questionDifficile.get(2);
			System.out.println("Question : " + str5.getTitre() + " | Difficulté : " + str5.getDifficulte() + " | "
					+ str5.getEnonce());
			Input.print(" Voici les trois choix qui s'offrent à vous : \n 1] \n 2] \n 3] ");
			x = Input.nextInt();
			switch (x) {
			case 1:
				Input.print("");
				break;
			case 2:
				Input.print("");
				break;
			case 3:
				Input.print("");
				break;
			}
			break;
		}

	}
}
