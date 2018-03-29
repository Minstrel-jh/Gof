package designpattern.p1creational.c1builder;

public class ConcreteBuilder implements Builder {

    Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.setPart1("part1:A");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2:B");
    }

    @Override
    public void buildPart3() {
        product.setPart3("part3:C");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
