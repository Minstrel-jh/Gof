package designpattern.p3behavioral.main;

import designpattern.p3behavioral.i1mediator.ConcreteColleague1;
import designpattern.p3behavioral.i1mediator.ConcreteColleague2;
import designpattern.p3behavioral.i1mediator.ConcreteMediator;
import designpattern.p3behavioral.i1mediator.Mediator;

// 中介者模式
public class p3i1Mediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("吃过了吗?");
        colleague2.send("没吃呢");

    }
}
