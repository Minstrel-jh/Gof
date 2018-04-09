package designpattern.p3behavioral.main;

import designpattern.p3behavioral.h1chainofresponsibility.ConcreteHandlerA;
import designpattern.p3behavioral.h1chainofresponsibility.ConcreteHandlerB;
import designpattern.p3behavioral.h1chainofresponsibility.ConcreteHandlerC;
import designpattern.p3behavioral.h1chainofresponsibility.Handler;

// 责任链模式
public class p3h1ChainOfResponsibility {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();

        Handler handlerB = new ConcreteHandlerB();
        handlerA.setSuccessor(handlerB);

        Handler handlerC = new ConcreteHandlerC();
        handlerB.setSuccessor(handlerC);

        handlerA.handleRequest(25);
    }
}
