package designpattern.p3behavioral.f1iterator;

public abstract class Aggregate<T> {

    public abstract Iterator<T> createIterator();

    public abstract int size();

    public abstract T get(int index);
}
