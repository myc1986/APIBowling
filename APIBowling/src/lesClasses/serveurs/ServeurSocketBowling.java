package lesClasses.serveurs;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import lesClasses.Reservation;
import lesInterfaces.IJoueur;
import lesInterfaces.IServeurSocketBowling;

public class ServeurSocketBowling implements IServeurSocketBowling {

	@Override
	public void main(String[] args) {
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
	
	@Override
	public String ObtenirTicketReservation(ArrayList<IJoueur> lesJoueurs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation ConfirmerTicketReservation(Reservation maReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation ObtenirScores(String codeReservation) {
		// TODO Auto-generated method stub
		return null;
	}

}
