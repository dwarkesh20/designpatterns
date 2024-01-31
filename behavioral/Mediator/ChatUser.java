package designpatterns.behavioral.Mediator;

// Concrete Colleague
class ChatUser implements User {
    private String name;
    private ChatMediator mediator;

    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("-----------------------------------");
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives message: " + message);
    }
}