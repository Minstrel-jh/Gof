package designpattern.p3behavioral.c2observer;

import java.util.Observable;

public class ObserverManager extends Observable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        setChanged(); // 只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。
        notifyObservers();
    }
}
