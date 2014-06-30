package lesClasses;

import java.util.ArrayList;

import lesInterfaces.IPartie;
import lesInterfaces.IJoueur;

public class Partie implements IPartie{
	protected ArrayList<IJoueur> _mesJoueurs;
	protected boolean _partieDemarre;
	protected int _tempsReelPartie;
	protected Integer _tempsPrevu;
	protected Integer _nbrDeFrame;
	protected boolean _partieTermine;
	
	public Partie(ArrayList<IJoueur> lesJoueurs)
	{
		_tempsReelPartie = 0;
		_tempsPrevu = 0;
		_nbrDeFrame = 10;
		_mesJoueurs = lesJoueurs;
		_partieTermine = false;
		_partieDemarre = false;
	}
	
	@Override
	public void DemarrerPartie() {
		// TODO Auto-generated method stub
		_partieTermine = false;
		_partieDemarre = true;
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
		
		
		_partieTermine = true;
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
	public int TempsPartie() {
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
