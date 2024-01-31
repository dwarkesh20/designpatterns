package designpatterns.behavioral.Mediator;

// Colleague interface
interface User {
    void sendMessage(String message);

    void receiveMessage(String message);
}