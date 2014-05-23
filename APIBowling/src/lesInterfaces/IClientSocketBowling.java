package lesInterfaces;

import java.awt.event.ItemListener;
import java.util.ArrayList;

import lesClasses.Reservation;

public interface IClientSocketBowling {
	void main(String[] args);
	String ObtenirTicketReservation(ArrayList<IJoueur> lesJoueurs);
	Reservation ConfirmerTicketReservation(Reservation maReservation);
	Reservation ObtenirScores(String codeReservation);
}
