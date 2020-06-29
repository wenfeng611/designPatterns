package wenfeng.designpattern.observer.custom;

public class User implements Observerd {

    private String name;

    public void callback() {
        System.out.println(this.name + " 收到回调通知");
    }

    public User(String name) {
        this.name = name;
    }
}
