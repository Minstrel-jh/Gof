package designpattern.p1creational.b1prototype;

public class Experience implements Cloneable {

    private String name;
    private int age;

    public Experience(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Experience clone() {
        return new Experience(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
