package lesClasses.serveurs;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurSocketBowling {

	public static void main(String[] args) {
		ServerSocket uneSocketServeur;
		Socket socketServeur;
		
		try {
			System.out.println("Démarrage d'écoute du serveur Bowling...");
			
			uneSocketServeur = new ServerSocket(2009);
			
			System.out.println("Serveur Bowling en écoute");
			
			socketServeur = uneSocketServeur.accept();
			
			System.out.println("Connexion établie");
			
			uneSocketServeur.close();
			socketServeur.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
