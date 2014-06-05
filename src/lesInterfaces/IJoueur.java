package lesInterfaces;

import java.util.ArrayList;

public interface IJoueur extends ILanceur {
	int ScoreTotalScore();
	String GetPrenom();
	void SetPrenom(String prenom);
	ArrayList<IFrame> GetMesFrames();
}
