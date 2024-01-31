package designpatterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        ACreator creator;

        creator = new A1Creator();
        A a1 = creator.createA();
        System.out.println(a1.get());

        creator = new A2Creator();
        A a2 = creator.createA();
        System.out.println(a2.get());
        
        
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
