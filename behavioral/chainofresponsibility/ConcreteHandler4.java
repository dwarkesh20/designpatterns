package designpatterns.behavioral.chainofresponsibility;

// ConcreteHandler4 class
class ConcreteHandler4 extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request <= 40) {
            System.out.println("ConcreteHandler4 handles the request: " + request);
        } else {
            passRequestToNextHandler(request);
        }
    }
}