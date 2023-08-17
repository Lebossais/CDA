package heritage_animal;

import utilitaires.Input;

public abstract class Animal {

	String nom ;
	String espece ;
	int age ;
	
	public Animal(String nom, String espece, int age) {
		this.nom = nom;
		this.espece = espece;
		this.age = age;
	}
	
	
	public void manger(String nourriture) {
		Input.print("Je peux manger" + nourriture);
	}
	public abstract void dormir();

	@Override
	public String toString() {
		return "Je m'appelle " + getNom() + " j'ai " + getAge() + " ans et je suis un " + getEspece()+ " ";	
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
