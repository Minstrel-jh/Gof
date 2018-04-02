package designpattern.p2structural.e1composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String nodeName) {
        super(nodeName);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.nodeName);
        children.forEach(it -> it.display(depth+2));
    }
}
