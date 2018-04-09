package designpattern.p3behavioral.i1mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事2收到消息：" + message);
    }
}
