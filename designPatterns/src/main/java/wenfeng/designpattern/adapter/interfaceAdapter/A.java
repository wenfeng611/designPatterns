package wenfeng.designpattern.adapter.interfaceAdapter;

//继承适配器 只需要重写自己需要的方法即可
public class A extends Adapter{
    @Override
    public void a() {
        //。。。。。。。
        System.out.println("aaaa....");
        super.a();
    }

    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}
