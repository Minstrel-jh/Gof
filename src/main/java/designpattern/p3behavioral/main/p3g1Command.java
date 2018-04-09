package designpattern.p3behavioral.main;

import designpattern.p3behavioral.g1command.Command;
import designpattern.p3behavioral.g1command.ConcreteCommand;
import designpattern.p3behavioral.g1command.Invoker;
import designpattern.p3behavioral.g1command.Receiver;

//命令模式
public class p3g1Command {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();

    }
}
