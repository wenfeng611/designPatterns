package wenfeng.designpattern.observer.custom;

//观察者主题对象  被观察的对象
public interface Subject {

    //接受注册
    void receiveRegister(Observerd observerd);

    //取消观察
    void remove(Observerd observerd);

    //通知变动
    void notifyObserver();
}
