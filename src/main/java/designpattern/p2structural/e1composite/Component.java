package designpattern.p2structural.e1composite;

public abstract class Component {

    String nodeName;

    public Component(String nodeName) {
        this.nodeName = nodeName;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
