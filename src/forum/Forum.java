package forum;

import utilitaires.Input;

public class Forum {

	Message[] tabMessage= new Message[99];
	
	public void ajouterUtilisateurMessages(MessageUtilisateur messageutilisteur) {
		for (int i = 0 ; i <= 20 ; i++) {
			if (tabMessage[i] == null) {
				tabMessage[i] = Message.main(null);
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
