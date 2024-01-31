package designpatterns.structural.decorator;

public class HtmlEncodedMessage implements Message {

    private Message message;
    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return ("HTML Content: " + message.getContent());
    }
}