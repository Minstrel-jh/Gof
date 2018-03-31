package designpattern.p3behavioral.main;

import designpattern.p3behavioral.c2observer.ConcreteObserver1;
import designpattern.p3behavioral.c2observer.ConcreteObserver2;
import designpattern.p3behavioral.c2observer.ObserverManager;

import java.util.Observer;

// 观察者模式-基于jdk实现
public class p3c2Observer {
    public static void main(String[] args) {
        ObserverManager manager = new ObserverManager();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        manager.addObserver(observer1);
        manager.addObserver(observer2);

        manager.setMessage("manager,启动");
        manager.setMessage("manager,杀死了一个人");
        manager.setMessage("manager,被枪毙了");
    }
}
