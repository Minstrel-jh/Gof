package designpattern.p3behavioral.b1templatemethod;

public class ConcreteTemplete extends AbstractTemplate {
    @Override
    protected void preStart() {
        System.out.println("preStart");
    }

    @Override
    protected void start() {
        System.out.println("do something");
    }

    @Override
    protected void after() {
        System.out.println("after do");
    }
}
