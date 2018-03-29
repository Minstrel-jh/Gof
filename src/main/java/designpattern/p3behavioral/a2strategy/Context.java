package designpattern.p3behavioral.a2strategy;

public class Context {

    Strategy strategy;

    public Context(String type) {
        switch (type) {
            case "A" :
                strategy = new ConcreteStrategyA();
                break;
            case "B" :
                strategy = new ConcreteStrategyB();
                break;
            default :
                strategy = null;
        }
    }

    public void doStrategy() {
        if (strategy != null) {
            strategy.fun1();
        } else {
            System.out.println("策略不存在");
        }
    }
}
