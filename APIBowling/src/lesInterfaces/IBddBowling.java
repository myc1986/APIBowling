package lesInterfaces;

import java.util.ArrayList;

import lesClasses.Reservation;

public interface IBddBowling {
	ArrayList<Reservation> GetListReservations();
	Reservation GetReservation(String codeReservation);
	IPiste GetPisteAvecMaxTempsDisponibilite();
	ArrayList<IFrame> GetListFrameJoueur(String idJoueur);
	ArrayList<IJoueur> GetListJoueurs();
	ArrayList<IPiste> GetListPistes();
	IPiste GetPiste(String idPiste);
	ArrayList<IPartie> GetListParties();
	IPartie GetPartie(String idPartie);
}
