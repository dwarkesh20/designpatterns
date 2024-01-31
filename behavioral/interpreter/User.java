package designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

// User class
class User {
    private Map<String, Boolean> permissions;

    public User() {
        this.permissions = new HashMap<>();
    }

    public void addPermission(String permission, boolean value) {
        permissions.put(permission, value);
    }

    public boolean hasPermission(String permission) {
        return permissions.getOrDefault(permission, false);
    }
}