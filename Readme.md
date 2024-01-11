## Duplicate Interceptor invocation on JBoss/Weld @WebService

This small example shows that one @AroundInvoke interceptor declared on a @WebService class gets invoked twice instead
of once.

### Build and Run

mvn clean install -DskipTests=true
deploy war onto a JBoss-EAP 7.4.14
start with openjdk-1.8.0.232

### Test WSDL

http://localhost:8080/webservice-with-interceptor/MyService?wsdl

### Run Test

make sure jboss runs & wsdl is accessible
mvn test

-> find the following lines in the jboss console log
```
2024-01-11 11:16:48,263 INFO    [CID=] stdout - MyInterceptor invoked with ctx.getClass()=org.jboss.invocation.InterceptorContext$Invocation
2024-01-11 11:16:48,264 INFO    [CID=] stdout - MyInterceptor invoked with ctx.getClass()=org.jboss.weld.interceptor.proxy.TerminalAroundInvokeInvocationContext
```
