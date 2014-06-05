package lesClasses.serveurs;

import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import lesClasses.Reservation;
import lesInterfaces.IClientSocketBowling;
import lesInterfaces.IJoueur;

public class ClientSocketBowling implements IClientSocketBowling {

	Socket maSocketClient;
	
	@Override
	public void main(String[] args) {
		Socket uneSocket;
		BufferedReader unBufferReader;
		
		try {
			uneSocket = new Socket(InetAddress.getLocalHost(), 2009);
			System.out.println("Demande de connexion");
			
			uneSocket.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
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
