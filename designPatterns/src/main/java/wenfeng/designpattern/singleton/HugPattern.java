package wenfeng.designpattern.singleton;

//饿汉模式
public class HugPattern {

    private static HugPattern instance = new HugPattern();
    private HugPattern (){}
    public static HugPattern getInstance() {
        return instance;
    }
}
