package designpattern.p1creational.d1abstractfactory;

public class Type2Factory extends Factory {

    @Override
    public ProductA createProductA() {
        return new Type2ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new Type2ProductB();
    }

    @Override
    public ProductC createProductC() {
        return new Type2ProductC();
    }
}
