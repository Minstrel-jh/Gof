package designpattern.main;

import designpattern.p1creational.a2factorymethod.Factory;
import designpattern.p1creational.a2factorymethod.Product;
import designpattern.p1creational.a2factorymethod.Product1Factory;
import designpattern.p1creational.a2factorymethod.Product2Factory;

// 工厂方法模式
public class p1a2FactoryMethod {
    public static void main(String[] args) {
        Factory factory = new Product1Factory();
        Product product1 = factory.createProduct();
        product1.desc();

        factory = new Product2Factory();
        Product product2 = factory.createProduct();
        product2.desc();
    }
}
