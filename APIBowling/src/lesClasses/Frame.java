package lesClasses;

import java.util.ArrayList;

import lesInterfaces.IFrame;
import lesInterfaces.IPiste;

public class Frame implements IFrame {
	private ArrayList<String> _lesQuillesTombees;
	private int _numero;
	private boolean _termine;
	private int _score;
	private boolean _lancerSupplementaire;
	
	public Frame(int numeroFrame)
	{
		_numero = numeroFrame;
		_termine = false;
		_score = 0;
		_lancerSupplementaire = false;
		_lesQuillesTombees = new ArrayList<String>();
	}
	
	@Override
	public void MiseAJour(IPiste unePiste) {
		
		if((!_termine && !_lancerSupplementaire) || (_lancerSupplementaire && _termine))
		{
			if (_lesQuillesTombees.size() <1) {
				switch (unePiste.CompterTotalQuillesRenverse()) 
				{
					case 0:
						_lesQuillesTombees.add("-");
						break;
					case 10:
						_lesQuillesTombees.add("X");
						
						if(_numero==10)
						{
							_lancerSupplementaire = true;
							unePiste.Reinitialiser();
						}
						
						_termine = true;
					default:
						_lesQuillesTombees.add(String.valueOf(unePiste.CompterQuillesRenverseAuLance()));
						_score = _score + unePiste.CompterQuillesRenverseAuLance();
						break;
				}
			} else {
				
				if(_numero == 10 && _lesQuillesTombees.size()<=2)
				{
					switch (unePiste.CompterTotalQuillesRenverse()) 
					{
						case 0:
							_lesQuillesTombees.add("-");
							break;
						case 10:
							if(unePiste.CompterQuillesRenverseAuLance() == unePiste.CompterTotalQuillesRenverse())
							{
								_lesQuillesTombees.add("X");
								unePiste.Reinitialiser();
								_lancerSupplementaire = true;
							}
							else
							{
								_lesQuillesTombees.add("/");
								_score = _score + unePiste.CompterQuillesRenverseAuLance();
								_lancerSupplementaire = false;
							}
							
							_termine = true;
						default:
							_lesQuillesTombees.add(String.valueOf(unePiste.CompterQuillesRenverseAuLance()));
							_score = _score + unePiste.CompterQuillesRenverseAuLance();
							break;
					}
				}
				else
				{
					switch (unePiste.CompterTotalQuillesRenverse()) 
					{
						case 0:
							_lesQuillesTombees.add("-");
							break;
						case 10:
								_lesQuillesTombees.add("/");
								_score = _score + unePiste.CompterQuillesRenverseAuLance();
						default:
							_lesQuillesTombees.add(String.valueOf(unePiste.CompterQuillesRenverseAuLance()));
							_score = _score + unePiste.CompterQuillesRenverseAuLance();
							break;
					}
				}
			}
		}
	}

	@Override
	public boolean PeutEncoreLance() {
		return (!_termine && !_lancerSupplementaire) || (_lancerSupplementaire && _termine);
	}

	@Override
	public int GetNumero() {
		return _numero;
	}

	@Override
	public int ObtenirScore() {
		
		return 0;
	}

	@Override
	public void AfficherScore() {
		
	}

}
