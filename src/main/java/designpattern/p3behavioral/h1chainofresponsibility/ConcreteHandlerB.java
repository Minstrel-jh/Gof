package designpattern.p3behavioral.h1chainofresponsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getSimpleName() + " deal request...");
        } else if (successor != null) {
            System.out.println(this.getClass().getSimpleName() + " transmit to " + successor.getClass().getSimpleName());
            successor.handleRequest(request);
        }
    }
}
