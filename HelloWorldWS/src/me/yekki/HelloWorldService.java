package me.yekki;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldService {
    public HelloWorldService() {
        super();
    }
    
    @WebMethod
    public String sayHello(String name) {
        
        return "Hello, " + name;
    }
}
