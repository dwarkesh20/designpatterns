package designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Hi! I am Dwarkesh.");
        System.out.println(message.getContent());
        
        message = new HtmlEncodedMessage(message);
        System.out.println(message.getContent());
        
    }
}
