package designpattern.p1creational.e1singleton;

// 懒汉式单例 - 双重检查锁定实现
public class Singleton1 {

    private Singleton1() {}
    private volatile static Singleton1 single = null;

    public static Singleton1 getInstance() {
        if(single == null) {
            synchronized (Singleton1.class) {
                if (single == null) {
                    single = new Singleton1();
                }
            }
        }
        return single;
    }

}
