//package xmu.soa.soa.publish;
//
//import javax.xml.ws.Endpoint;
//
//import xmu.soa.soa.service.impl.HelloServiceImpl;
//
//public class Server {
//    public static void main(String[] args) {
//        System.out.println("cxf service start..");
//        HelloServiceImpl serviceImpl=new HelloServiceImpl();
//        String address="http://localhost:8080/HelloService/hello";
//        Endpoint.publish(address, serviceImpl);
//    }
//}