package server.soa.server.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;
import server.soa.server.entity.User;
import server.soa.server.service.HelloService;

@WebService(serviceName = "HelloService"//服务名
        ,targetNamespace = "http://service.server.soa.server"//报名倒叙，并且和接口定义保持一致
        ,endpointInterface = "server.soa.server.service.HelloService")//包名
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String text) {
        System.out.println("param text is :" + text);
        return "hello " + text;
    }

    @Override
    public String sayHellloToUser(User user) {
        System.out.println("param user is :" +user);
        return "hello " + user.getName();
    }

}
