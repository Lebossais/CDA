package bibliotheque2;

import utilitaires.Input;

public class BD extends Livre{
	
Livre[] tabBD = new Livre[20] ;
	
	public String ajout() {
		
		for (int i = 0 ; i <= 20 ; i++) {
			if (tabBD[i] == null) {
				tabBD[i] = ajouter();
				tabBD[i] = ajoutcollection();
				break ;
			}
			}
		return null;
		}
	
	
	public void liste() {
		
		for (int m = 0 ; m <= 19 ; m++) {
			if (tabBD[m] != null) {
				
			Input.print(tabBD[m].nom);
			Input.print(tabBD[m].auteur);
			Input.print(tabBD[m].isbn);
			Input.print(tabBD[m].dispo);
			Input.print("---------------");
			}
		}
	}
		
	public void recherche() {
		boolean d = false ;
		Input.nextLine();
		Input.print("Veuillez indiquer quel livre vous chercher :");
		String src = Input.nextLine(); 
				for (int o = 0 ; o <= 19 ; o++) {
					if (tabBD[o] == null) {
						d = false ;
				}
				else if (tabBD[o].nom.matches(src)){
					d = true ;
					break ;
				}
		}
	}
	}
	
