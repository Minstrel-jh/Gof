package designpattern.p3behavioral.g1command;

// 命令模式
public class ConcreteCommand implements Command {

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
