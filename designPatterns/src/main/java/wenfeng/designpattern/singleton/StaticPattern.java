package wenfeng.designpattern.singleton;

//静态内部类单例模式
//第一次调用getInstance方法，jvm加载 Inner 初始化instance ，只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性。
public class StaticPattern {

    private StaticPattern(){}

    public static StaticPattern getInstance(){
        return Inner.instance;
    }

    private static class Inner{
        private static final StaticPattern instance = new StaticPattern();
    }
}
