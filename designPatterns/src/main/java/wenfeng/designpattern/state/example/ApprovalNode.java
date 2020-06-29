package wenfeng.designpattern.state.example;


//审批节点  有部门领导的  有hr的。。。
public abstract class ApprovalNode {

    private String name; //标记是领导或者是hr 也可以用不同的role区分

    public abstract void handle(FlowContext flowContext);  //每个节点对流程的处理  关联到context

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
