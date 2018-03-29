package designpattern.p2structural.a1decorator;

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void fun1() {
        component.fun1();
    }
}