package designpattern.p3behavioral.e1memento;

// 管理人
public class Caretaker {

    private Memento memento;

    public Memento retrieveMemento() {
        return memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
