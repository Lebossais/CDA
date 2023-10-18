package PrincipesEncapsulation;

import utilitaires.Input;

public class Principale {
	
	public static void main (String[] args) {
		
		Input.print("Passage dans le main");
		
//		Personne martin = new Personne ("martin","?");
//		martin.afficher();
//		
//		Personne durand = new Personne ("durand", "J2E SA");
//		durand.afficher() ;
//		durand.quitterSociete();
//		durand.afficher() ;
//		durand.setSociete("EJB Corporate");
//		durand.afficher() ;
//		durand.setSociete("EJB Corporate");
//		durand.afficher() ;

		Adresse Lille = new Adresse (55, "Bld de la Libération", 59000, "Lille");
		Adresse Paris = new Adresse (2, "rue Victor Hugo", 75008,"Paris");
		Adresse Nantes = new Adresse (17,"rue de la République",44000,"Nantes");
//		
//		Personne Jean = new Personne ("Jean", "Dupont", 30, Lille);
//		Personne Bernard = new Personne ("Bernard", "Morin", 45, Paris);
//		Personne Nathalie = new Personne ("Nathalie", "Durand", 35, Nantes);

//		
//		Lille.afficher();
//		Paris.afficher();
//		Nantes.afficher();
//		
//		Jean.afficher();
//		Bernard.afficher();
//		Nathalie.afficher();
//		Jean.setAdresse(new Adresse(44, "Rue des Docks", 33000, "Bordeaux"));
//		Jean.afficher();
//		Nathalie.setAdresse(Paris);
//		Nathalie.afficher();
		
	}

	
}
