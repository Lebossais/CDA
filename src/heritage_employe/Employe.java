package heritage_employe;

import utilitaires.Input;

public class Employe {

	String nom ;
	int age ;
	int salaire ;
	int augmentation ;
	
	public Employe employe() {
		
		Employe employe = new Employe();
	
		Input.print("Veuillez indiquer le nom :");
		this.nom = Input.nextLine();

		Input.print("Veuillez indiquer l'âge :");
		this.age = Input.nextInt();

		Input.print("Veuillez indiquer le salaire :");
		this.salaire = Input.nextInt();
		
		return employe;
	
	}
	
	
	
	public void augmentation() {
		Input.print("Veuillez indiquer le montant de l'augmentation :");
		this.augmentation = Input.nextInt();
		calculeSalaire();
		
	}


	public String toString() { 
		return getNom()+ " a " + getAge() + " ans et gagne " + getSalaire() + "€ par mois car c'est un Employé." ;
		
	}	
	
	public void afficher() {
		
	}
	
	public void calculeSalaire() {
		setSalaire(getSalaire() + getAugmentation());
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public int getAugmentation() {
		return augmentation;
	}

	public void setAugmentation(int augmentation) {
		this.augmentation = augmentation;
	}


	
}
