package designpattern.p3behavioral.e2memento;

// 管理人
public class Caretaker {

    private IMemento memento;

    public IMemento retrieveMemento() {
        return memento;
    }

    public void saveMemento(IMemento memento) {
        this.memento = memento;
    }
}
