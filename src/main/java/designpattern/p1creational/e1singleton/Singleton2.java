package designpattern.p1creational.e1singleton;

// 懒汉式单例 - 内部静态类实现
public class Singleton2 {

    private Singleton2() {}

    // 内部静态类是要在有引用了以后才会装载到内存
    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
