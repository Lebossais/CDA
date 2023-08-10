package bibliotheque2;

import utilitaires.Input;

public class Roman extends Livre {

	Livre[] tabRoman = new Livre[20] ;
	
	public Roman ajout() {
		
		for (int i = 0 ; i <= 20 ; i++) {
			if (tabRoman[i] == null) {
				tabRoman[i] = ajouter();
				tabRoman[i] = ajoutisbn();
				break ;
			}
			}
		return null ;
		}

	public void liste() {
		
		for (int m = 0 ; m <= 19 ; m++) {
			if (tabRoman[m] != null) {
				
			Input.print(tabRoman[m].nom);
			Input.print(tabRoman[m].auteur);
			Input.print(tabRoman[m].isbn);
			Input.print(tabRoman[m].dispo);
			Input.print("---------------");
			}
		}
	}
		
	public void recherche() {
	

	Input.nextLine();
	Input.print("Veuillez indiquer quel livre vous chercher :");
	String src = Input.nextLine(); 
			for (int o = 0 ; o <= 19 ; o++) {
				if (tabRoman[o] == null) {
					d = false ;
			}
			else if (tabRoman[o].nom.matches(src)){
				d = true ;
				break ;
			}
				
	}
	}
}
