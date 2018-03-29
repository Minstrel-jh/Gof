package designpattern.p3behavioral.a1strategy;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        strategy.fun1();
    }
}
