package designpatterns.structural.Facade;

// Client class representing trees in the forest
class TreeClient {
    private final TreeType treeType; // Intrinsic state
    private final int x, y; // Extrinsic state

    public TreeClient(String treeType, int x, int y) {
        this.treeType = TreeFactory.getTreeType(treeType);
        this.x = x;
        this.y = y;
    }

    public void display() {
        treeType.display(x, y);
    }
}