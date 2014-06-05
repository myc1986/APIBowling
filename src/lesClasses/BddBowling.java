package lesClasses;

import java.util.ArrayList;

import lesInterfaces.IBddBowling;
import lesInterfaces.IFrame;
import lesInterfaces.IJoueur;
import lesInterfaces.IPartie;
import lesInterfaces.IPiste;

public class BddBowling implements IBddBowling {

    private String _nomServer = "LOCALHOST";
    private String _identifiant = "PROJASPNET";
    private String _motDePasse = "PROJASPNET";
	
	@Override
	public ArrayList<Reservation> GetListReservations() {

		return null;
	}

	@Override
	public Reservation GetReservation(String codeReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPiste GetPisteAvecMaxTempsDisponibilite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IFrame> GetListFrameJoueur(String idJoueur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IJoueur> GetListJoueurs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IPiste> GetListPistes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPiste GetPiste(String idPiste) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IPartie> GetListParties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPartie GetPartie(String idPartie) {
		// TODO Auto-generated method stub
		return null;
	}

}
