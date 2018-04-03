package designpattern.p2structural.f1bridge;

public class RefinedAbstracion extends Abstraction {

    private String name;

    public RefinedAbstracion(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.print(name);
        super.operation();
    }
}
