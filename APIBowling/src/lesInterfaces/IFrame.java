package lesInterfaces;

import lesClasses.Piste;

public interface IFrame {
	void MisAJourFrame(Piste unePiste);
	boolean PeutEncoreLance();
	int GetNumeroFrame();
	int ObtenirScore();
	void AfficherScore();
}
