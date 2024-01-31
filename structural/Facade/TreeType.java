package designpatterns.structural.Facade;

// Concrete Flyweight class representing a type of tree
class TreeType implements Tree {
    private final String name; // Intrinsic state

    public TreeType(String name) {
        System.out.println("TreeType Created: " + name);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Tree Type: " + name + ", Location: (" + x + ", " + y + ")");
    }
}