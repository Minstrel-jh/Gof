package designpattern.p2structural.main;

import designpattern.p2structural.g1flyweight.Flyweight;
import designpattern.p2structural.g1flyweight.FlyweightFactory;
import designpattern.p2structural.g1flyweight.UnsharedConcreteFlyweight;

// 享元模式
public class p2Flyweight {

    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
