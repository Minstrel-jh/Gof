package designpattern.p2structural.g1flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

    private ConcurrentHashMap<String, Flyweight> flyweights = new ConcurrentHashMap<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
