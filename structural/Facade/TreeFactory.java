package designpatterns.structural.Facade;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory class to create and manage tree types
class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name) { 
        TreeType treeType = treeTypes.get(name);
        
        if (treeType != null) return treeType;
        
        // If the tree type doesn't exist, create a new one and add it to the map
        treeType = new TreeType(name);
        treeTypes.put(name, treeType);
        System.out.println("Intrinsic states -> "+treeTypes.values().stream().map(t->t.getName()).toList());
        return treeType;
    }
}