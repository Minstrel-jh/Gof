package designpattern.p2structural.b1proxy;

public class RealSubject implements Subject {
    @Override
    public void fun1() {
        System.out.println("i do something...");
    }
}
