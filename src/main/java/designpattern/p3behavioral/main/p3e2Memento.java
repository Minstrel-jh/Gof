package designpattern.p3behavioral.main;

import designpattern.p3behavioral.e2memento.Caretaker;
import designpattern.p3behavioral.e2memento.IMemento;
import designpattern.p3behavioral.e2memento.Originator;

// 备忘录模式-黑盒实现
public class p3e2Memento {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("ON");
        System.out.println("修改前：" + o);

        Caretaker c = new Caretaker();
        IMemento memento = o.createMemento();
        c.saveMemento(memento);

        o.setState("OFF");
        System.out.println("修改后：" + o);

        o.restoreMemento(c.retrieveMemento());
        System.out.println("已恢复：" + o);

    }
}
