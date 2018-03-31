package designpattern.p3behavioral.main;

import designpattern.p3behavioral.c1observer.ConcreteObserver1;
import designpattern.p3behavioral.c1observer.ConcreteObserver2;
import designpattern.p3behavioral.c1observer.Observer;
import designpattern.p3behavioral.c1observer.ObserverManager;

public class p3c1Observer {
    public static void main(String[] args) {
        ObserverManager manager = new ObserverManager();

        Observer observer1 = new ConcreteObserver1();
        manager.registerObserver(observer1);

        Observer observer2 = new ConcreteObserver2();
        manager.registerObserver(observer2);

        manager.setMessage("manager,启动");
        manager.setMessage("manager,杀死了一个人");
        manager.setMessage("manager,被枪毙了");
    }
}
