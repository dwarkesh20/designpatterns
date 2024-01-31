package designpatterns.creational.Singleton;

public class EagerRegistry {
    private EagerRegistry() {
        System.out.println("Eager Registry");
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }

}
