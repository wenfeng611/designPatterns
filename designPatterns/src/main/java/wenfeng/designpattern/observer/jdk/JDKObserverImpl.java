package wenfeng.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class JDKObserverImpl {


    public static class JDKObserver implements Observer{
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("收到通知： "+arg);
        }
    }

    //被观察对象
    public static class JDKSubject  extends Observable {
        private String name;

        public JDKSubject(String name) {
            this.name = name;
        }

        public void setChange(){
            super.setChanged();
        }
    }

    public static void main(String[] args) {
        JDKObserver jdkObserver = new JDKObserver();
        JDKSubject jdkSubject = new JDKSubject("AAA");
        jdkSubject.addObserver(jdkObserver);
        System.out.println("通知观察者");
        //设置更新了  通知完一次之后会清除状态
        jdkSubject.setChange();
        jdkSubject.notifyObservers("aaaa");
    }
}
