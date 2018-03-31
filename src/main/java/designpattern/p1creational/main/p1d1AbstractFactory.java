package designpattern.p1creational.main;

import designpattern.p1creational.d1abstractfactory.*;

// 抽象工厂模式
public class p1d1AbstractFactory {

    public static void main(String[] args) {
        Factory type1Factory = new Type1Factory();
        ProductA productA = type1Factory.createProductA();
        ProductB productB = type1Factory.createProductB();
        ProductC productC = type1Factory.createProductC();
        productA.descA();
        productB.descB();
        productC.descC();

        Factory type2Factory = new Type2Factory();
        productA = type2Factory.createProductA();
        productB = type2Factory.createProductB();
        productC = type2Factory.createProductC();
        productA.descA();
        productB.descB();
        productC.descC();

    }
}
