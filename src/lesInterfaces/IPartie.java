package lesInterfaces;

public interface IPartie {
	void DemarrerPartie();
	void TerminerPartie();
	void AfficherScoresJoueurs();
	int CalculerScoreJoueur(String prenom);
	int CalculerScoresJoueurs();
	boolean PartieDemarree();
	int TempsPartie();
	void AfficherScoreJoeur(String prenom);
}
