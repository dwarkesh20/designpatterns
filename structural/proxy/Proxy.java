package designpatterns.structural.proxy;

// Proxy class
class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        // The real object is not created until the first request
    }

    @Override
    public void request() {
        // Lazy initialization: create the real object only when it's needed
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        // Additional logic can be added before or after forwarding the request to the real object
        System.out.println("Proxy: Logging, validating, or caching before forwarding request.");
        realSubject.request();
        System.out.println("Proxy: Additional operations after the real request.");
    }
}// Factory for creating instances of Subject (RealSubject or Proxy)