import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
    @Test
    public void shouldSayHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals(helloWorld.sayHelloWorld(), "Hello World!");

    }
}