package designpattern.p2structural.d3adapter;

public class Target extends Adapter {
    @Override
    public void funB() {
        System.out.println("Invoking funB");
    }

    @Override
    public void funE() {
        System.out.println("Invoking funE");
    }
}
