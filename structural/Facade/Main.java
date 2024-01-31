package designpatterns.structural.Facade;

// Main class to demonstrate the Flyweight Design Pattern
public class Main {
    public static void main(String[] args) {
        // Creating tree clients with different types and locations
        TreeClient tree1 = new TreeClient("Oak", 10, 20);
        TreeClient tree2 = new TreeClient("Pine", 30, 40);
        TreeClient tree3 = new TreeClient("Oak", 50, 60);
        TreeClient tree4 = new TreeClient("Oak", 50, 60);
        TreeClient tree5 = new TreeClient("Palm", 10, 70);

        // Displaying the trees (reusing tree types where possible)
        tree1.display();
        tree2.display();
        tree3.display();
        tree4.display();
        tree5.display();
    }
}
