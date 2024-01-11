package ch.baloise.example;

import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyService {

    @WebMethod
    @Interceptors({MyInterceptor.class})
    public String sayHi() {
        return "Hi there";
    }

}
