package designpattern.p2structural.d2adapter;

import designpattern.p2structural.d1adapter.Adaptee;

public class Adapter extends Adaptee implements Target {

    @Override
    public void method1() {
        specialMethod();
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
