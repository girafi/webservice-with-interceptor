## Duplicate Interceptor invocation on JBoss/Weld @WebService

This small example shows that one @AroundInvoke interceptor declared on a @WebService class gets invoked twice instead
of once.

### Build and Run

mvn clean install -DskipTests=true
deploy war onto a JBoss-EAP 7.4.10

### Test WSDL

http://localhost:8080/webservice-with-interceptor/MyService?wsdl

### Run Test

make sure jboss runs & wsdl is accessible
mvn test

-> find the following lines in the jboss console log

