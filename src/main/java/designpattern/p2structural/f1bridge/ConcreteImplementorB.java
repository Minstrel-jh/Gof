package designpattern.p2structural.f1bridge;

public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B 执行");
    }
}
