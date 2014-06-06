package lesClasses;

import java.util.ArrayList;

import lesInterfaces.IPartie;
import lesInterfaces.IJoueur;

public class Partie implements IPartie{
	private ArrayList<IJoueur> _mesJoueurs;
	
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int TempsPartie() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int CalculerScoresJoueurs(){
		int _totalScoreJoueurs = 0;
		
		for(IJoueur joueur : _mesJoueurs){
		_totalScoreJoueurs += joueur.ScoreTotalScore();
		}
		
		return _totalScoreJoueurs;
	}

}
