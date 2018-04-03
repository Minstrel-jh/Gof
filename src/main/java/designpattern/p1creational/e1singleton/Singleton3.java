package designpattern.p1creational.e1singleton;

public class Singleton3 {

    private static Singleton3 single = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getInstance() {
        return single;
    }
}
