package designpattern.p2structural.a1decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void fun1() {
        System.out.println("before decorator B");
        super.fun1();
        System.out.println("after decorator B");
    }
}
