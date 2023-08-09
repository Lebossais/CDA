package forum;

import utilitaires.Input;

public class Forum {

	static Message[] tabMessage= new Message[99];
	
	public static void ajouterUtilisateurMessages() {
		for (int i = 0 ; i <= 20 ; i++) {
			if (tabMessage[i] == null) {
				tabMessage[i] = Message.ajouterUtilisateurMessages() ;
				break ;
			}
			}
	}
	
	public void nombremessages(Utilisateur utilisateur, Message message) {
	for (int m = 0 ; m <= 19 ; m++) {
		if (tabMessage[m] != null) {

		Input.print(tabMessage[m].utilisateur);
		Input.print(tabMessage[m].message);
		Input.print("---------------");
		}
	}
	}
}
