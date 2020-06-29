package wenfeng.designpattern.state;

public class BState implements State {

    public BState() {
    }

    @Override
    public void handle(Context context) {
        System.out.println("B state...");
        //再下一个状态的处理、。。。
    }
}
