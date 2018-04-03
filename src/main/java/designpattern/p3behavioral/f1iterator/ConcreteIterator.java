package designpattern.p3behavioral.f1iterator;

public class ConcreteIterator<T> implements Iterator<T> {

    private Aggregate<T> aggregate;
    private int index = 0;

    public ConcreteIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if(index >= aggregate.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public T next() {
        return aggregate.get(index++);
    }
}
