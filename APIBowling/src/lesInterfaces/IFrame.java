package lesInterfaces;

import lesClasses.Piste;

public interface IFrame {
	void MisAJourFrame(IPiste unePiste);
	boolean PeutEncoreLance();
	int GetNumeroFrame();
	int ObtenirScore();
	void AfficherScore();
}
