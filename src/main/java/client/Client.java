package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import server.IUserService;

/**
 * 客户端对服务端进行测试.
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/webserviceutil/UserService?wsdl");
			QName qname = new QName("http://impl.server/","UserService");
			Service s = Service.create(url, qname);
			IUserService userService=s.getPort(IUserService.class);
			userService.getInfo();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
