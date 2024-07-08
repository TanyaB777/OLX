package hw_8;

public class MyBrowser implements CanBeClosed{
    @Override
    public void close() {
        System.out.println("Browser closed");
    }
}
