package ch.baloise.example;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class MyInterceptor {

    @AroundInvoke
    public Object aroundInvoke(InvocationContext ctx) throws Exception {
        System.out.println("MyInterceptor invoked with ctx.getClass()=" + ctx.getClass().getName());
        return ctx.proceed();
    }
}
