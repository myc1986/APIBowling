package lesClasses;

import java.security.Timestamp;
import java.sql.Date;
import java.util.ArrayList;

import lesInterfaces.IPartie;
import lesInterfaces.IJoueur;

public class Partie implements IPartie{
	protected ArrayList<IJoueur> _mesJoueurs;
	protected boolean _partieDemarre;
	protected Timestamp _tempsReelPartie;
	protected Timestamp _tempsPrevu;
	protected Integer _nbrDeFrame;
	
	@Override
	public void DemarrerPartie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AfficherScoreJoeur(String prenom) {
		
		for(IJoueur joueur : _mesJoueurs){
			if(joueur.GetPrenom() == prenom)
			{
				System.out.println("Score Joueur "+joueur.GetPrenom()+" "+joueur.ScoreTotalScore());
			}
		}
	}

	@Override
	public void TerminerPartie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AfficherScoresJoueurs() {
		for(IJoueur joueur : _mesJoueurs){
			System.out.println("Score Joueur "+joueur.GetPrenom()+" "+joueur.ScoreTotalScore());
		}
	}

	@Override
	public int CalculerScoreJoueur(String prenom) {
		int _totalScoreJoueur = 0;
		
		for(IJoueur joueur : _mesJoueurs){
			if(joueur.GetPrenom() == prenom)
			{
				_totalScoreJoueur = joueur.ScoreTotalScore();
			}
		}
		
		return _totalScoreJoueur;
	}

	@Override
	public boolean PartieDemarree() {
		return _partieDemarre;
	}

	@Override
	public Timestamp TempsPartie() {
		// TODO Auto-generated method stub
		return _tempsReelPartie;
	}
	
	public int CalculerScoresJoueurs(){
		int _totalScoreJoueurs = 0;
		
		for(IJoueur joueur : _mesJoueurs){
		_totalScoreJoueurs += joueur.ScoreTotalScore();
		}
		
		return _totalScoreJoueurs;
	}

}
