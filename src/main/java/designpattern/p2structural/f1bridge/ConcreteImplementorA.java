package designpattern.p2structural.f1bridge;

public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A 执行");
    }
}
