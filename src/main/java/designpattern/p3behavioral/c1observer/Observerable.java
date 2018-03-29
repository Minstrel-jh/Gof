package designpattern.p3behavioral.c1observer;

public interface Observerable {

    // 添加观察者
    void registerObserver(Observer observer);

    // 移除观察者
    void removeObserver(Observer observer);

    // 通知观察者
    void notifyObserver();
}
