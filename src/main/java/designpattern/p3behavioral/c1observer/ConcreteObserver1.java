package designpattern.p3behavioral.c1observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver1 accept message:" + message);
    }
}
