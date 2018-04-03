package designpattern.p1creational.e1singleton;

// 懒汉式单例 - 双重检查锁定实现
public class Singleton0 {

    private Singleton0() {}
    private volatile static Singleton0 single = null;

    public static Singleton0 getInstance() {
        if (single == null) {
            single = new Singleton0();
        }
        return single;
    }

}
