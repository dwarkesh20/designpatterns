package designpatterns.behavioral.interpreter;

// Terminal Expression
class Permission implements PermissionExpression {
    private String permission;

    public Permission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(User user) {
        return user.hasPermission(permission);
    }
}