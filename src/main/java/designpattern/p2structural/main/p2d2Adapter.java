package designpattern.p2structural.main;

import designpattern.p2structural.d2adapter.Adapter;
import designpattern.p2structural.d2adapter.Target;

// 类适配器模式
public class p2d2Adapter {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
        target.method3();
    }
}
