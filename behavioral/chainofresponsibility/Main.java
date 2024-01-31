package designpatterns.behavioral.chainofresponsibility;

// Client class
public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        Handler handler4 = new ConcreteHandler4();
        Handler handler5 = new ConcreteHandler5();
        

        // Set up the chain
        ((AbstractHandler) handler1).setNextHandler(handler2);
        ((AbstractHandler) handler2).setNextHandler(handler3);
        ((AbstractHandler) handler3).setNextHandler(handler4);
        ((AbstractHandler) handler4).setNextHandler(handler5);
        ((AbstractHandler) handler5).setNextHandler(null); // Last handler in the chain
        
        System.out.println("Chain of handlers:");

        // Client sends requests to the first handler in the chain
        handler5.handleRequest(5); // Handled by ConcreteHandler1
        handler1.handleRequest(15); // Handled by ConcreteHandler2
        handler4.handleRequest(25); // Handled by ConcreteHandler3
        handler3.handleRequest(35); // Handled by ConcreteHandler4
        handler3.handleRequest(45); // Handled by ConcreteHandler5

        handler1.handleRequest(55); // Handled by ConcreteHandler6
        handler1.handleRequest(65); // No handler in the chain can handle this request
    }
}