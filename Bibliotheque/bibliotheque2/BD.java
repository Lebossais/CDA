package bibliotheque2;

import utilitaires.Input;

public class BD extends Livre {

	static Livre[] tabBD = new Livre[20];

	public String ajout() {

		for (int i = 0; i <= 20; i++) {
			if (BD.tabBD[i] == null) {
				BD.tabBD[i] = ajouter();
				BD.tabBD[i] = ajoutcollection();
				break;
			}
		}
		return null;
	}

	public void liste() {
		Input.print("Voici la liste complète des BD");
		Input.print("+------+------------+-------------------+--------------------+");
		Input.print("| Nom  | Auteur     | Collection        | Disponibilité      |");
		Input.print("+------+------------+-------------------+--------------------+");
		for (int m = 0; m <= 19; m++) {
			if (BD.tabBD[m] != null) {

				Input.print(BD.tabBD[m].nom + " | " + BD.tabBD[m].auteur + " | " + BD.tabBD[m].collection + " | "
						+ BD.tabBD[m].dispo);
			}
		}
		Input.print("+------+------------+-------------------+--------------------+");
	}

	public boolean rechercher(String src) {
		boolean i = false;
		for (int o = 0; o <= 19; o++) {
			if (BD.tabBD[o] == null) {
				i = false;
			} else if (BD.tabBD[o].nom.matches(src)) {
				i = true;
				break;
			}
		}
		return super.recherche(src, i);
	}

	public boolean emprunt(String src1) {
		boolean d = false;
		for (int o = 0; o <= 19; o++) {
			if (BD.tabBD[o] == null && d == false) {
				d = false;
			} else if (BD.tabBD[o].nom.equals(src1) && BD.tabBD[o].dispo == true) {
				d = true;
				BD.tabBD[o].dispo = false;
				break;
			}
		}
		return super.emprunt(src1, d);
	}

	public boolean rendre(String src2) {
		boolean a = false;
		for (int o = 0; o <= 19; o++) {
			if (BD.tabBD[o] == null && a == false) {
				a = false;
			} else if (BD.tabBD[o].collection == src2 && BD.tabBD[o].dispo == false) { // passez la valeur en true
				a = true;
				BD.tabBD[o].dispo = true;
				break;
			}
		}
		return super.rendre(src2, a);
	}

}
