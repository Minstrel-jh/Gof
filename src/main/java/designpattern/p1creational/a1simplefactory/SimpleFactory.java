package designpattern.p1creational.a1simplefactory;

public class SimpleFactory {

    public static Product createProduct(int type) {

        switch (type) {
            case 1 :
                return new Product1();
            case 2 :
                return new Product2();
            case 3 :
                return new Product3();
            case 4 :
                return new Product4();
        }
        return null;
    }
}