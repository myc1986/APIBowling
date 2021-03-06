package lesClasses;

import lesInterfaces.IArgument;

public class Argument implements IArgument {
	private String _nom;
	private String _value;
	
	@Override
	public String GetNom() {
		return _nom;
	}

	@Override
	public String GetValue() {
		return _value;
	}

	@Override
	public void SetNom(String value) {
		_nom = value;
	}

	@Override
	public void SetValue(String value) {
		_value = value;
	}
}
