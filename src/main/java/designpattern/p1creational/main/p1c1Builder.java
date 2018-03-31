package designpattern.p1creational.main;

import designpattern.p1creational.c1builder.ConcreteBuilder;
import designpattern.p1creational.c1builder.Director;
import designpattern.p1creational.c1builder.Product;

// 建造者模式
public class p1c1Builder {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.build(new ConcreteBuilder());
        System.out.println(product);
    }
}
