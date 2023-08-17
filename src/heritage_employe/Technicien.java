package heritage_employe;

import utilitaires.Input;

public class Technicien {
	String nom ;
	int age ;
	int salaire ;
	int grade ;
	int augmentation;
	
public Technicien technicien() {
		
		Technicien technicien = new Technicien();
	
		Input.print("Veuillez indiquer le nom :");
		this.nom = Input.nextLine();

		Input.print("Veuillez indiquer l'âge :");
		this.age = Input.nextInt();

		Input.print("Veuillez indiquer le salaire :");
		this.salaire = Input.nextInt();
		
		Input.print("Veuillez indiquer son grade :");
		this.grade = Input.nextInt();
		prime();
		
		return technicien;
	
	}
	
	
	
	public void augmentation() {
		Input.print("Veuillez indiquer le montant de l'augmentation :");
		this.augmentation = Input.nextInt();
		calculeSalaire();
	}


	public String toString() {
		return getNom()+ " a " + getAge() + " ans et gagne " + getSalaire() + "€ par mois car c'est un Technicien de grade : " + getGrade() + ".";
		
	}
	
	public void afficher() {
		
	}
	
	public void calculeSalaire() {
		setSalaire(getSalaire() + getAugmentation());
		
	}
	
	public void prime() {
		
		if (getGrade() == 1) {
			setSalaire(getSalaire()+100);
		} else if (getGrade() == 2) {
			setSalaire(getSalaire()+200);
		} else if (getGrade() == 3) {
			setSalaire(getSalaire()+300);
		}
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAugmentation() {
		return augmentation;
	}

	public void setAugmentation(int augmentation) {
		this.augmentation = augmentation;
	}	
	
}

// grade = 1 alors Prime = 100
// grade = 2 alors Prime = 200
// grade = 3 alors Prime = 300

