package control;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Conversor {
	
	@WebMethod
	public String Conversor(@WebParam(name= "CtoK")String CtoK)
	{
	return	"Conversor: " + CtoK;
	}

}
