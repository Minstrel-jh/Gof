package designpattern.p3behavioral.main;

import designpattern.p3behavioral.f1iterator.Aggregate;
import designpattern.p3behavioral.f1iterator.ConcreteAggregate;
import designpattern.p3behavioral.f1iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

// 迭代器模式
public class p3f1Iterator {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");

        Aggregate<String> aggregate = new ConcreteAggregate<>(l);
        Iterator<String> i = aggregate.createIterator();

        while(i.hasNext()) {
            String next = i.next();
            System.out.println(next);
        }
    }
}
