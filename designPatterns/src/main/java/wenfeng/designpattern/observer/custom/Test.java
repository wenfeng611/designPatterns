package wenfeng.designpattern.observer.custom;

public class Test {
    public static void main(String[] args) {
        //微信公众号
        Subject wechat = new WechatMessage();
        //user
        Observerd userA = new User("A");

        Observerd userB = new User("B");

        //公众号接受注册
        wechat.receiveRegister(userA);  //用户注册到公众号
        wechat.receiveRegister(userB);

        System.out.println("有新消息来的时候 通知观察者");
        //...新消息来的时候
        wechat.notifyObserver();
    }
}
