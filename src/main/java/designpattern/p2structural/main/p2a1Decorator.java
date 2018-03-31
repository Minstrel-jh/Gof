package designpattern.p2structural.main;

import designpattern.p2structural.a1decorator.*;

// 装饰者模式
public class p2a1Decorator {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecoratorA(component);
        decorator = new ConcreteDecoratorB(decorator);

        decorator.fun1();

    }
}
