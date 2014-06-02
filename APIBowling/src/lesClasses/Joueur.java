package lesClasses;

import java.util.ArrayList;
import java.util.Iterator;

import lesInterfaces.IFrame;
import lesInterfaces.IJoueur;

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
}
