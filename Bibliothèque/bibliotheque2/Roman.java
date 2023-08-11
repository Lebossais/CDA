package bibliotheque2;

import utilitaires.Input;

public class Roman extends Livre {

	static Livre[] tabRoman = new Livre[20];

	public Roman ajout() {

		for (int i = 0; i <= 20; i++) {
			if (Roman.tabRoman[i] == null) {
				Roman.tabRoman[i] = ajouter();
				Roman.tabRoman[i] = ajoutisbn();
				break;
			}
		}
		return null;
	}

	public void liste() {
		Input.print("Voici la liste complète des Romans.");
		Input.print("+------+------------+-------------------+--------------------+");
		Input.print("| Nom  | Auteur     | Numéro ISBN       | Disponibilité      |");
		Input.print("+------+------------+-------------------+--------------------+");

		for (int m = 0; m <= 19; m++) {
			if (Roman.tabRoman[m] != null) {
				// | %c | %, 10d | %tF %tf | %-20s|\n",
				Input.print(Roman.tabRoman[m].nom + " | " + Roman.tabRoman[m].auteur + " | " + Roman.tabRoman[m].isbn
						+ " | " + Roman.tabRoman[m].dispo);
			}
		}
		Input.print("+------+------------+-------------------+--------------------+");
	}

	public boolean recherche(String src) {
		boolean i = false;
		for (int o = 0; o <= 19; o++) {
			if (Roman.tabRoman[o] == null) {
				i = false;
			} else if (Roman.tabRoman[o].nom.equals(src)) {
				i = true;
				break;
			}
		}
		return super.recherche(src, i);
	}

	public boolean emprunt(String src1) {
		boolean d = false;
		for (int o = 0; o <= 19; o++) {
			if (Roman.tabRoman[o] == null && d == false) {
				d = false;
			} else if (Roman.tabRoman[o].nom.equals(src1) && Roman.tabRoman[o].dispo == true) {
				d = true;
				Roman.tabRoman[o].dispo = false;
				break;
			}
		}
		return super.emprunt(src1, d);
	}

	public boolean rendre(String src2) {
		boolean a = false;
		for (int o = 0; o <= 19; o++) {
			if (Roman.tabRoman[o] == null && a == false) {
				a = false;
			} else if (Roman.tabRoman[o].collection == src2 && Roman.tabRoman[o].dispo == false) { // passez la valeur
																									// en true
				a = true;
				Roman.tabRoman[o].dispo = true;
				break;
			}
		}
		return super.rendre(src2, a);
	}

}
