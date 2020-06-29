package wenfeng.designpattern.observer.custom;

import java.util.HashSet;
import java.util.Set;

public class WechatMessage implements Subject {

    //存储这个公众号监听的观察者
    private static Set<Observerd> set = new HashSet<>();

    //用户注册这个公众号  类似监听这个公众号
    public void receiveRegister(Observerd observerd) {
        set.add(observerd);
    }

    public void remove(Observerd observerd) {
        set.remove(observerd);
    }

    public void notifyObserver() {
        set.forEach(Observerd::callback);
    }
}
