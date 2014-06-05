package lesClasses;

import java.util.Random;
import lesInterfaces.IPiste;

public class Piste implements IPiste {

	private int _nbrQuilles;
	private int _tempsDisponibilite;
	private int _nbrQuillesMax;
	private int _nbrQuilleRenverseAuLance;
	
	public Piste(int tempsDisponibilite)
	{
		_nbrQuillesMax = 10;
		_nbrQuilles = 10;
		_tempsDisponibilite = tempsDisponibilite;
		_nbrQuilleRenverseAuLance = 0;
	}
	
	public Piste(int nbrQuilles, int tempsDisponibilite)
	{
		_nbrQuillesMax = nbrQuilles;
		_nbrQuilles = nbrQuilles;
		_tempsDisponibilite = tempsDisponibilite;
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
		
		_nbrQuilleRenverseAuLance = nbrQuillesRenverser;
		
		return nbrQuillesRenverser;
	}

	@Override
	public int ObtenirTempsDisponibiliteRestant() {
		return _tempsDisponibilite;
	}

	@Override
	public void Reinitialiser() {
		_nbrQuilles = _nbrQuillesMax;
		_nbrQuilleRenverseAuLance = 0;
	}

	@Override
	public int CompterQuillesEnPlace() {
		return _nbrQuilles;
	}

	@Override
	public int CompterTotalQuillesRenverse() {
		return _nbrQuillesMax - _nbrQuilles;
	}

	@Override
	public int CompterQuillesRenverseAuLance() {
		return _nbrQuilleRenverseAuLance;
	}
}
