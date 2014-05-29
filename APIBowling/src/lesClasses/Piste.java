package lesClasses;

import java.util.Random;
import lesInterfaces.IPiste;

public class Piste implements IPiste {

	private int _nbrQuilles;
	private int _tempsDisponibilité;
	private int _nbrQuillesMax;
	
	public Piste(int tempsDisponibilite)
	{
		_nbrQuillesMax = 10;
		_nbrQuilles = 10;
		_tempsDisponibilité = tempsDisponibilite;
	}
	
	public Piste(int nbrQuilles, int tempsDisponibilite)
	{
		_nbrQuillesMax = nbrQuilles;
		_nbrQuilles = nbrQuilles;
		_tempsDisponibilité = tempsDisponibilite;
	}

	@Override
	public int RenverserQuilles() {
		Random leRandom = new Random();
		
		int nbrTire = leRandom.nextInt(_nbrQuillesMax+1);
		int nbrQuillesRenverser = 0;
		
		if((nbrTire <= _nbrQuilles) && (nbrTire > 0))
		{
			_nbrQuilles = _nbrQuilles - nbrTire;
			nbrQuillesRenverser = nbrTire;
		}
		
		return nbrQuillesRenverser;
	}

	@Override
	public int ObtenirTempsDisponibiliteRestant() {
		return _tempsDisponibilité;
	}

	@Override
	public void Reinitialiser() {
		_nbrQuilles = _nbrQuillesMax;
	}

	@Override
	public int CompterQuillesEnPlace() {
		return _nbrQuilles;
	}

	@Override
	public int CompterQuillesRenverse() {
		return _nbrQuillesMax - _nbrQuilles;
	}
}
