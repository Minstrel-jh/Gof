package designpattern.main;

import designpattern.p1creational.b1prototype.Experience;

// 原型模式
// 通过一个对象实例确定创建对象的种类，并且通过拷贝创建新的实例
public class p1b1Prototype {
    public static void main(String[] args) {
        Experience ex1 = new Experience("Peter", 18);
        Experience ex2 = ex1.clone();

        System.out.println(ex1);
        System.out.println(ex2);
    }
}
