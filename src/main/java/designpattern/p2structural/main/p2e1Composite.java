package designpattern.p2structural.main;

import designpattern.p2structural.e1composite.Component;
import designpattern.p2structural.e1composite.Composite;
import designpattern.p2structural.e1composite.Leaf;

// 组合模式 树形结构
public class p2e1Composite {
    public static void main(String[] args) {
        Component root = new Composite("根节点");

        Component b1 = new Composite("b1");
        Component b2 = new Composite("b2");
        Component b3 = new Composite("b3");

        root.add(b1);
        root.add(b2);
        root.add(b3);

        Component l1 = new Leaf("leaf1");
        Component l2 = new Leaf("leaf2");
        Component l3 = new Leaf("leaf3");
        Component l4 = new Leaf("leaf4");
        Component l5 = new Leaf("leaf5");
        Component l6 = new Leaf("leaf6");

        b1.add(l1);
        b1.add(l2);
        b2.add(l3);
        b2.add(l4);
        b2.add(l5);
        b3.add(l6);

        root.display(1);

    }
}
