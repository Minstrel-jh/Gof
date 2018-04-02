package designpattern.p2structural.main;

import designpattern.p2structural.d1adapter.Adaptee;
import designpattern.p2structural.d1adapter.Adapter;
import designpattern.p2structural.d1adapter.Target;

// 对象适配模式
public class p2d1Adapter {

    public static void main(String[] args) {
        // 创建被适配者
        Adaptee adaptee = new Adaptee();

        Target target = new Adapter(adaptee);

        target.method1();
        target.method2();
        target.method3();
    }
}
