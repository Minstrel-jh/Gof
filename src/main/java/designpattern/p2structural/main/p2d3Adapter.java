package designpattern.p2structural.main;

import designpattern.p2structural.d3adapter.Target;

// 接口适配器模式
public class p2d3Adapter {
    public static void main(String[] args) {
        Target target = new Target();
        target.funB();
        target.funE();
    }
}
