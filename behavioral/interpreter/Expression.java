package designpatterns.behavioral.interpreter;

// Abstract Expression
interface Expression {
    int interpret(Context context);
}