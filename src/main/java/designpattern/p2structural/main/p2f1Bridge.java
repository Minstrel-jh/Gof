package designpattern.p2structural.main;

import designpattern.p2structural.f1bridge.Abstraction;
import designpattern.p2structural.f1bridge.ConcreteImplementorA;
import designpattern.p2structural.f1bridge.ConcreteImplementorB;
import designpattern.p2structural.f1bridge.RefinedAbstracion;

public class p2f1Bridge {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstracion("ProName");
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
