package ch.baloise.example;

import ch.baloise.example.client.MyService;
import ch.baloise.example.client.MyServiceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceClientTest {

    @Test
    public void test() throws Exception {
        MyService port = new MyServiceService().getMyServicePort();
        Assertions.assertEquals("Hi there", port.sayHi());
    }
}
