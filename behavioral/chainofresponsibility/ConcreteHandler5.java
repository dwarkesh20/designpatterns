package designpatterns.behavioral.chainofresponsibility;

// ConcreteHandler5 class
class ConcreteHandler5 extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request <= 50) {
            System.out.println("ConcreteHandler5 handles the request: " + request);
        } else {
            passRequestToNextHandler(request);
        }
    }
}