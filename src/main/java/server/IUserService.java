package server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IUserService {

	@WebMethod
	public String getInfo();
}
