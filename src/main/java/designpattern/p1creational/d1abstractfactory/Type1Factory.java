package designpattern.p1creational.d1abstractfactory;

public class Type1Factory extends Factory {

    @Override
    public ProductA createProductA() {
        return new Type1ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new Type1ProductB();
    }

    @Override
    public ProductC createProductC() {
        return new Type1ProductC();
    }
}
