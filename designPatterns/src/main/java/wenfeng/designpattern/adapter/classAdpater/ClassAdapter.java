package wenfeng.designpattern.adapter.classAdpater;

import wenfeng.designpattern.adapter.Adaptee;
import wenfeng.designpattern.adapter.Target;

public class ClassAdapter  extends Adaptee implements Target {

    @Override
    public void target() {
        adaptee();
    }

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.target();
    }
}
