package designpatterns.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User sender, String message) {
        for (User user : users) {
            // Send the message to all users except the sender
            if (user == sender)  continue; 
            user.receiveMessage(message);
        }
    }
}