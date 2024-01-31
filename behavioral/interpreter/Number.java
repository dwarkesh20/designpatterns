package designpatterns.behavioral.interpreter;

// Terminal Expression
class Number implements Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}