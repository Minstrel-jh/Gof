package designpattern.p3behavioral.main;

import designpattern.p3behavioral.a2strategy.Context;

// 策略模式-结合简单工厂
public class p3a2Strategy {

    public static void main(String[] args) {

        Context ctx = new Context("B");

        ctx.doStrategy();

    }
}
