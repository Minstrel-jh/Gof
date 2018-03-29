package designpattern.p1creational.c1builder;

public class Director {

    public Product build(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();

        return builder.buildProduct();
    }
}
