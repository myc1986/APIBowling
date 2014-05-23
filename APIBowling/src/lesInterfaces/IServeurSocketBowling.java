package lesInterfaces;

import java.util.ArrayList;

import lesClasses.Reservation;

public interface IServeurSocketBowling {
	void main(String[] args);
	String ObtenirTicketReservation(ArrayList<IJoueur> lesJoueurs);
	Reservation ConfirmerTicketReservation(Reservation maReservation);
	Reservation ObtenirScores(String codeReservation);
}
