package designpatterns.behavioral.chainofresponsibility;

// ConcreteHandler1 class
class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request <= 10) {
            System.out.println("ConcreteHandler1 handles the request: " + request);
        } else {
            passRequestToNextHandler(request);
        }
    }
}