package server.soa.server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import server.soa.server.entity.User;

@WebService(targetNamespace = "http://service.server.soa.server")
public interface HelloService {

    @WebMethod
    public String sayHello(@WebParam(name="text")String text);

    @WebMethod
    public String sayHellloToUser(User user);
}
