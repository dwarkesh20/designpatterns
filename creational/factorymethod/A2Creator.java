package designpatterns.creational.factorymethod;

public class A2Creator extends ACreator{

    @Override
    public A createA() {
        return new A2();
    }
    
}
