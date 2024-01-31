package designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

// Context
class Context {
    private Map<String, Integer> variables;

    public Context() {
        this.variables = new HashMap<>();
    }

    public void setVariable(String variable, int value) {
        variables.put(variable, value);
    }

    public int getVariable(String variable) {
        return variables.getOrDefault(variable, 0); // Default value is 0 if the variable is not found
    }
}
