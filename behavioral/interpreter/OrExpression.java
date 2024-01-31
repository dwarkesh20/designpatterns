package designpatterns.behavioral.interpreter;

class OrExpression implements PermissionExpression {
    private PermissionExpression left;
    private PermissionExpression right;

    public OrExpression(PermissionExpression left, PermissionExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(User user) {
        return left.interpret(user) || right.interpret(user);
    }
}