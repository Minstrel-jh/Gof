package designpattern.p3behavioral.d1state;

public class StateA implements State {

    @Override
    public void handle() {
        System.out.println("StateA handle...");
    }
}
