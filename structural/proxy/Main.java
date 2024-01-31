package designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Subject subject1 = SubjectFactory.createSubject();        
        clientCode(subject1);
        Subject subject2 = SubjectFactory.createSubject();        
        clientCode(subject2);
    }

    private static void clientCode(Subject subject) {
        subject.request();
    }
}
