package designpattern.p3behavioral.f1iterator;

import java.util.List;

public class ConcreteAggregate<T> extends Aggregate<T> {

    private List<T> list;

    public ConcreteAggregate(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
