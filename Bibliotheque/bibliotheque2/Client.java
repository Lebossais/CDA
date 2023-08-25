package bibliotheque2;

import java.util.ArrayList;

import utilitaires.Input;

public class Client {

	static String src ;
	static int i;
	String nom ;
	String prenom ;
	String email ;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	static ArrayList<Client> listeclient = new ArrayList<Client>();
	
	
	public static void check() {
		Input.print("Pour utiliser la bibliothèque nous vous demandons d'être inscrit dans notre Base de Données.");

		if (listeclient.isEmpty()) {
			Input.print("Vous êtes notre premier client ! Merci de vous inscrire !");
			stockage();
		} else {
			Input.print("Merci de nous indiquer votre nom s'il vous plait :");
			String src = Input.nextLine();
			for (i = 0; i < listeclient.size(); i++) {
				Client name = listeclient.get(i);
				if (src.equals(listeclient.get(i))) {
					Input.print(
							"Vous êtes déjà enregistrer dans notre Base de Données ! Voici vos informations complètes :");
					Input.print(name.getPrenom() + "\n" + name.getNom() + "\n" + name.getEmail()
							+ "\n Vos Informations sont-elles à jours ?");
				} else {
					Input.print("Vous n'êtes pas dans notre Base de Données");
					stockage() ;
					
				}
			}
		}
	}

	public static Client stockage() {
		Input.nextLine();
		Input.print("Nous allons vous créer un profil. Veuillez suivre la démarche suivante :");
		Client client = new Client();
		
		Input.print("Merci d'indiquer ici votre prénom :");	//Fais des Regex
		client.prenom = Input.nextLine();
		
		Input.print("Merci d'indiquer ici votre nom :");	//Fais des Regex
		client.nom = Input.nextLine();
		
		Input.print("Merci d'indiquer ici votre email :"); 	 //Fais des Regex
		client.email = Input.nextLine();
		listeclient.add(client);
		
		return client;
	}
	}
	
