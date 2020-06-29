package wenfeng.designpattern.adapter.objectAdapter;

import wenfeng.designpattern.adapter.Adaptee;
import wenfeng.designpattern.adapter.Target;

public class ObjectAdapter implements Target {

    public Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void target() {
        adaptee.adaptee();
    }

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.target();
    }
}
