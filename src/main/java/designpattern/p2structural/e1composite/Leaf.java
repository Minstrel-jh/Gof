package designpattern.p2structural.e1composite;

public class Leaf extends Component {

    public Leaf(String nodeName) {
        super(nodeName);
    }

    @Override
    public void add(Component c) {
        System.out.println("Can not add to Leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Can not remove from Leaf");
    }

    @Override
    public void display(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.nodeName);
    }
}
