package designpattern.p3behavioral.c2observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String msg = ((ObserverManager) o).getMessage();
        System.out.println("ConcreteObserver1 accept message:"+msg);
    }
}
