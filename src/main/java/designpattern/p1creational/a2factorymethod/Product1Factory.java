package designpattern.p1creational.a2factorymethod;

public class Product1Factory extends Factory {
    @Override
    public Product createProduct() {
        return new Product1();
    }
}
