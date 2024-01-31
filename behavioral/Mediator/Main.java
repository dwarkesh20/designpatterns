package designpatterns.behavioral.Mediator;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a mediator
        ChatMediator chatMediator = new ChatMediatorImpl();

        // Create users and add them to the chat
        User user1 = new ChatUser("User 1", chatMediator);
        User user2 = new ChatUser("User 2", chatMediator);
        User user3 = new ChatUser("User 3", chatMediator);

        // Add users to the mediator
        ((ChatMediatorImpl) chatMediator).addUser(user1);
        ((ChatMediatorImpl) chatMediator).addUser(user2);
        ((ChatMediatorImpl) chatMediator).addUser(user3);

        // Users send and receive messages through the mediator
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi there!");
        user3.sendMessage("Greetings!");
    }
}

