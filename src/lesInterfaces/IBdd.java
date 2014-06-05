package lesInterfaces;

import javax.sql.DataSource;

public interface IBdd {
	boolean SeConnecter();
	boolean SeDeconnecter();
	DataSource ExecuterReqSQL(String reqSQL);
	DataSource ExecuterProcedure(String nomProncedure, String[]nomParam, String[]valuesParams);
}
