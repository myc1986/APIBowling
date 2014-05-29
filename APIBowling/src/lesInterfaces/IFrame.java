package lesInterfaces;

import lesClasses.Piste;

public interface IFrame {
	void MisAJour(IPiste unePiste);
	boolean PeutEncoreLance();
	int GetNumero();
	int ObtenirScore();
	void AfficherScore();
}
