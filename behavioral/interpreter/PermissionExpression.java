package designpatterns.behavioral.interpreter;

// Expression interface
interface PermissionExpression {
    boolean interpret(User user);
}