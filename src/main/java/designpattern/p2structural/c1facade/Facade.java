package designpattern.p2structural.c1facade;

public class Facade {

    Module1 m1;
    Module2 m2;
    Module3 m3;

    public Facade() {
        m1 = new Module1();
        m2 = new Module2();
        m3 = new Module3();
    }

    public void run() {
        m1.startM();
        m2.startM();
        m3.startM();
    }
}
