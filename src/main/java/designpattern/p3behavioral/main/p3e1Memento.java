package designpattern.p3behavioral.main;

import designpattern.p3behavioral.e1memento.Caretaker;
import designpattern.p3behavioral.e1memento.Memento;
import designpattern.p3behavioral.e1memento.Originator;

// 备忘录模式-白盒实现
public class p3e1Memento {
    public static void main(String[] args) {
        // 设置初始状态
        Originator o = new Originator();
        o.setState("ON");
        System.out.println("修改前：" + o);

        // 保存当前状态
        Caretaker c = new Caretaker();
        Memento memento = o.createMemento();
        c.saveMemento(memento);

        // 修改状态
        o.setState("OFF");
        System.out.println("修改后：" + o);

        // 恢复保存状态
        o.restoreMemento(c.retrieveMemento());
        System.out.println("已恢复：" + o);
    }
}
