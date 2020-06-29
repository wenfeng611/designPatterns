package wenfeng.designpattern.singleton;

//枚举单例模式
//默认枚举实例的创建是线程安全的，并且在任何情况下都是单例
public enum EnumPattern {
    INSTANCE;

    public static EnumPattern getInstance(){
        return EnumPattern.INSTANCE;
    }
}
