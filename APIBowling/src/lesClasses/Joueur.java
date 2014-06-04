package lesClasses;

import java.util.ArrayList;
import java.util.Iterator;

import lesInterfaces.IFrame;
import lesInterfaces.IJoueur;
import lesInterfaces.IPiste;

public class Joueur implements IJoueur {
	private String _prenom;
	private ArrayList<IFrame> _mesFrames;
	
	@Override
	public int ScoreTotalScore() {
		int scoreTotal = 0;
		
		for (IFrame uneFrame : _mesFrames) {
			scoreTotal = scoreTotal + uneFrame.ObtenirScore();
		}
		
		return 0;
	}

	@Override
	public String GetPrenom() {
		return _prenom;
	}

	@Override
	public void SetPrenom(String prenom) {
		_prenom = prenom;
	}

	private IFrame ObtenirFrameAJouer()
	{
		IFrame laFrameAJoue = null;
		Integer iCountFrame = 0;
		boolean aTrouve = false;
		
		do {
			if(_mesFrames.get(iCountFrame).PeutEncoreLance())
			{
				laFrameAJoue = _mesFrames.get(iCountFrame);
				aTrouve = true;
			}
		} while (iCountFrame >= _mesFrames.size() || aTrouve);
		
		return laFrameAJoue;
	}

	@Override
	public void Lancer(IPiste laPiste) {
		int iCountFrame = 0;
		boolean frameTrouve = false;
		IFrame laFrameDeTravail = null;
		
		while (!frameTrouve && iCountFrame < _mesFrames.size()) {
			
			if(_mesFrames.get(iCountFrame).PeutEncoreLance())
			{
				laFrameDeTravail = _mesFrames.get(iCountFrame);
				frameTrouve = true;
			}
		}
		
		if (laFrameDeTravail != null) {
			
			while (laFrameDeTravail.PeutEncoreLance()) {
				laPiste.RenverserQuilles();
				laFrameDeTravail.MiseAJour(laPiste);
			}
		}
	}

	@Override
	public ArrayList<IFrame> GetMesFrames() {
		return _mesFrames;
	}
}
