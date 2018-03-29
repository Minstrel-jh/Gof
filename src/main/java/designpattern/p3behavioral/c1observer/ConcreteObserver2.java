package designpattern.p3behavioral.c1observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver2 accept message:" + message);
    }
}
