package designpattern.p2structural.b1proxy;

public class SubjectProxy implements Subject {

    protected Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void fun1() {
        System.out.println("proxy pre do");
        subject.fun1();
        System.out.println("proxy after do");
    }
}