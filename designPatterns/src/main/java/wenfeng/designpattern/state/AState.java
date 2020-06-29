package wenfeng.designpattern.state;

public class AState implements State{

    @Override
    public void handle(Context context) {
        System.out.println("A state...");
        //设置A状态的下一个状态
        context.setState(new BState());
        //下一个状态的处理
        context.getState().handle(context);
    }
}
