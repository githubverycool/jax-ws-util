package server.impl;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import server.IUserService;

/**
 * 1.使用JAX-WS注解编写一个简单的Webservice服务端
 * 2.使用jdk 自带简易容器发布webservice.
 * 3.已配置是该服务端在tomcat启动时发布webservice
 * @author Administrator
 *
 */
@WebService(endpointInterface = "server.IUserService",serviceName="UserService",portName="UserServicePort")
public class UserServiceImpl implements IUserService {
	static int i = 0;

	@Override
	public String getInfo() {
		System.out.println("success");
		return "success" + ++i;
	}


	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/webserviceutil/UserService",
				new UserServiceImpl());
		
	}

}
