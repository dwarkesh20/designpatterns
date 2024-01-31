package designpatterns.behavioral.chainofresponsibility;

// Abstract Handler class implementing common methods
abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void passRequestToNextHandler(int request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for request: " + request);
        }
    }
}