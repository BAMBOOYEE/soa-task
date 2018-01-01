package server.soa.server.publish;

import server.soa.server.service.HelloService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private HelloService helloService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, helloService);
        //接口发布在 /HelloService 目录下
        endpoint.publish("/HelloService");
        return endpoint;
    }
}
