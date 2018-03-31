package designpattern.p1creational.main;

import designpattern.p1creational.a1simplefactory.Product;
import designpattern.p1creational.a1simplefactory.SimpleFactory;

// 简单工厂模式
public class p1a1SimpleFactory {

    public static void main(String[] args) {
        Product product1 = SimpleFactory.createProduct(1);
        product1.desc();

        Product product2 = SimpleFactory.createProduct(2);
        product2.desc();

        Product product3 = SimpleFactory.createProduct(3);
        product3.desc();

        Product product4 = SimpleFactory.createProduct(4);
        product4.desc();
    }
}
