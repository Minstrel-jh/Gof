package designpattern.p3behavioral.d1state;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.handle();
    }

}
