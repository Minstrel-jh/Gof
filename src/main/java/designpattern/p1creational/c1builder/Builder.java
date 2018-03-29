package designpattern.p1creational.c1builder;

public interface Builder {

    void buildPart1();

    void buildPart2();

    void buildPart3();

    Product buildProduct();
}
