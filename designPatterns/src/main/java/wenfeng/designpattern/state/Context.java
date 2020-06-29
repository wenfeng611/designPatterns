package wenfeng.designpattern.state;

public class Context {

    //记录状态
    private State state;

    public void start(){
        state.handle(this);
    }

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public static void main(String[] args) {
        Context context = new Context(new AState());
        context.start();
    }
}
