package designpatterns.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        EagerRegistry registry1 = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry1.hashCode() == registry2.hashCode());

        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry1.hashCode() == lazyRegistry2.hashCode());

        LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazyRegistryWithDCL1.hashCode() == lazyRegistryWithDCL2.hashCode());
    }
}
