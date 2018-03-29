package designpattern.p3behavioral.b1templatemethod;

public abstract class AbstractTemplate {

    public void templateMethod() {
        preStart();
        start();
        after();
    }

    protected abstract void preStart();

    protected abstract void start();

    protected abstract void after();
}
