package designpattern.p2structural.d2adapter;

public class Adaptee implements IAdaptee {
    @Override
    public void specialMethod() {
        System.out.println("Invoking specialMethod");
    }
}
