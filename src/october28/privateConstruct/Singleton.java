package october28.privateConstruct;

public class Singleton {

    private static Singleton singleton/* = new Singleton()  // EAGER */;

    public static Singleton getInstance() {
        if (singleton == null) singleton = new Singleton(); // LAZY
        return singleton;
    }

    private Singleton() {

    }
}
