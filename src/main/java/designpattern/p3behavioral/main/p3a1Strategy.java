package designpattern.p3behavioral.main;

import designpattern.p3behavioral.a1strategy.ConcreteStrategyB;
import designpattern.p3behavioral.a1strategy.Context;

// 策略模式
public class p3a1Strategy {

    public static void main(String[] args) {

        Context ctx = new Context(new ConcreteStrategyB());

        ctx.doStrategy();

    }
}
