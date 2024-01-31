package designpatterns.behavioral.interpreter;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a user and set permissions
        User user = new User();
        user.addPermission("read", true);
        user.addPermission("write", false);

        // Build an abstract syntax tree representing "read AND write"
        PermissionExpression expression = new AndExpression(
                new Permission("read"),
                new Permission("write"));

        // Interpret the expression
        boolean result = expression.interpret(user);

        // Output the result
        System.out.println("User has read AND write permission: " + result);

        // orPermission
        PermissionExpression orExpression = new OrExpression(
                new Permission("read"),
                new Permission("write"));

        result = orExpression.interpret(user);
        System.out.println("User has read OR write permission: " + result);

        // notPermission
        PermissionExpression notExpression = new NotExpression(
                new Permission("write"));
                
        result = notExpression.interpret(user);
        System.out.println("User has NOT write permission: " + result);

    }
}
