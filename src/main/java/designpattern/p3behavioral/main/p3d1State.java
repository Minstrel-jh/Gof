package designpattern.p3behavioral.main;

import designpattern.p3behavioral.d1state.Context;
import designpattern.p3behavioral.d1state.StateA;
import designpattern.p3behavioral.d1state.StateB;

public class p3d1State {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new StateA());
        context.doAction();

        context.setState(new StateB());
        context.doAction();
    }
}
