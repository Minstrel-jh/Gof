package designpattern.p2structural.main;

import designpattern.p2structural.b1proxy.RealSubject;
import designpattern.p2structural.b1proxy.Subject;
import designpattern.p2structural.b1proxy.SubjectProxy;

// 代理模式-静态代理
public class p2b1Proxy {
    public static void main(String[] args) {
        Subject proxy = new SubjectProxy(new RealSubject());
        proxy.fun1();
    }
}
