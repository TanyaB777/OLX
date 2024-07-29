package hw_14;

@Service(name = "Super lazy Service", lazyLoad = true)
public class LazyService {

    @Init
    public void lazyInit() throws Exception{
        System.out.println("Hello from lazyService!");
    }
}
