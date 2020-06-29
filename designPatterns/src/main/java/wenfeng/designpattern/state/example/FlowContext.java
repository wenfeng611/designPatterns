package wenfeng.designpattern.state.example;

public class FlowContext {

    ApprovalNode approvalNode;


    private  String conent; //请假的内容

    private boolean success;  //是否请假成功

    private int status;  //当前审批流程的状态 0默认  1已提交  2部门已审批  3hr已审批

    //提交申请
    public static void submit(FlowContext context){
        SelfNode selfNode = new SelfNode();
        context.setApprovalNode(selfNode);
        context.getApprovalNode().handle(context);
    }


    public static void main(String[] args) {
        FlowContext flowContext = new FlowContext("xxx申请请假。。。");
        FlowContext.submit(flowContext);
    }

    public FlowContext(String conent) {
        this.conent = conent;
    }

    public ApprovalNode getApprovalNode() {
        return approvalNode;
    }

    public void setApprovalNode(ApprovalNode approvalNode) {
        this.approvalNode = approvalNode;
    }

    public String getConent() {
        return conent;
    }

    public void setConent(String conent) {
        this.conent = conent;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
