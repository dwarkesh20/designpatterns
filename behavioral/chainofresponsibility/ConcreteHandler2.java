package designpatterns.behavioral.chainofresponsibility;

// ConcreteHandler2 class
class ConcreteHandler2 extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request <= 20) {
            System.out.println("ConcreteHandler2 handles the request: " + request);
        } else {
            passRequestToNextHandler(request);
        }
    }
}