package hw_14;

@Service(name = "Super fast Service")
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("Hello from initService!");
    };

    public void leftService() {
        System.out.println("Hello from leftService");
    };

}
