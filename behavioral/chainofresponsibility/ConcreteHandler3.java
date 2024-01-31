package designpatterns.behavioral.chainofresponsibility;

// ConcreteHandler3 class
class ConcreteHandler3 extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request <= 30) {
            System.out.println("ConcreteHandler3 handles the request: " + request);
        } else {
            passRequestToNextHandler(request);
        }
    }
}