package designpatterns.structural.proxy;

// Factory for creating instances of Subject (RealSubject or Proxy)
class SubjectFactory {
    private static Subject subjectInstance;

    public static Subject createSubject() {
        if (subjectInstance == null) {
            // Create a Proxy for the first call
            subjectInstance = new Proxy();
            System.out.println("Proxy");
        } else if (subjectInstance instanceof Proxy) {
            // Switch to RealSubject for subsequent calls
            subjectInstance = new RealSubject();
            System.out.println("Riyal");
        }

        return subjectInstance;
    }
}
