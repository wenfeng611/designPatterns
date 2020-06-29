package wenfeng.designpattern.singleton;

//懒汉模式
public class LazyPatern {

    private static LazyPatern instance;
    private LazyPatern (){}

    public static LazyPatern getInstance() {
        if (instance == null) {
            instance = new LazyPatern();
        }
        return instance;
    }
}
