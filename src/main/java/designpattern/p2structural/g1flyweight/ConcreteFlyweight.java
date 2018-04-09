package designpattern.p2structural.g1flyweight;

public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight:"+extrinsicstate);
    }
}
