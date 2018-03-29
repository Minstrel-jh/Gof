package designpattern.main;

import designpattern.p3behavioral.b1templatemethod.AbstractTemplate;
import designpattern.p3behavioral.b1templatemethod.ConcreteTemplete;

// 模板方法模式
public class p3b1TemplateMethod {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplete();
        template.templateMethod();
    }
}
