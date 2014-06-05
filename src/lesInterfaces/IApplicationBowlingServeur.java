package lesInterfaces;

import java.util.ArrayList;
import lesClasses.Reservation;

public interface IApplicationBowlingServeur {
	String ObtenirTicketReservation(ArrayList<IJoueur> lesJoueurs);
	Reservation ConfirmerTicketReservation(Reservation maReservation);
	Reservation ObtenirScores(String codeReservation);
}