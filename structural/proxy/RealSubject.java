package designpatterns.structural.proxy;

// RealSubject class
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}