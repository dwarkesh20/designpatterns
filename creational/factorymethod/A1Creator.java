package designpatterns.creational.factorymethod;

public class A1Creator extends ACreator{

    @Override
    public A createA() {
        return new A1();
    }
    
}
