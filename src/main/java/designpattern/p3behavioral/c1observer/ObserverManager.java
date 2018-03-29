package designpattern.p3behavioral.c1observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverManager implements Observerable {

    private List<Observer> observerList;

    private String message;

    public ObserverManager() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(observer -> observer.update(message));
    }

    public void setMessage(String msg) {
        this.message = msg;
        notifyObserver();
    }
}
