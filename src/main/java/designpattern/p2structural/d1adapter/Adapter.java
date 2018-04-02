package designpattern.p2structural.d1adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.specialMethod();
    }

    @Override
    public void method2() {
        System.out.println("Invoking method2");
    }

    @Override
    public void method3() {
        System.out.println("Invoking method3");
    }
}
