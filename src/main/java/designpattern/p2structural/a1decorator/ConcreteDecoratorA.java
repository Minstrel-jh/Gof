package designpattern.p2structural.a1decorator;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void fun1() {
        System.out.println("before decorator A");
        component.fun1();
        System.out.println("after decorator A");
    }
}
