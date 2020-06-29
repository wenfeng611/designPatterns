package wenfeng.designpattern.singleton;


//双重锁模式
// singleton=new Singleton()对象的创建在JVM中可能会进行重排序，所以使用volatile修饰
public class DLockPattern {

    private volatile static DLockPattern singleton;

    private DLockPattern (){}

    public static DLockPattern getSingleton() {
        if (singleton == null) {
            synchronized (DLockPattern.class) {
                if (singleton == null) {
                    singleton = new DLockPattern();
                }
            }
        }
        return singleton;
    }
}
