package lesInterfaces;

import java.security.Timestamp;

public interface IPartie {
	void DemarrerPartie();
	void TerminerPartie();
	void AfficherScoresJoueurs();
	int CalculerScoreJoueur(String prenom);
	int CalculerScoresJoueurs();
	boolean PartieDemarree();
	Timestamp TempsPartie();
	void AfficherScoreJoeur(String prenom);
}
