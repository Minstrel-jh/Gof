package designpattern.p3behavioral.h1chainofresponsibility;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getSimpleName() + " deal request...");
        } else if (successor != null) {
            System.out.println(this.getClass().getSimpleName() + " transmit to " + successor.getClass().getSimpleName());
            successor.handleRequest(request);
        }
    }
}
