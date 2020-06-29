package wenfeng.designpattern.state.example;

import wenfeng.designpattern.state.StatusType;

public class HRNode extends ApprovalNode{
    @Override
    public void handle(FlowContext flowContext) {
         //hr审批的节点
        System.out.println("hr审批流程。。。");
        //审批结束
        flowContext.setStatus(StatusType.HRAGREED.getCode());
        System.out.println("当前状态为： "+ StatusType.from(flowContext.getStatus()));
        flowContext.setSuccess(true);
        System.out.println("审批流程结束");
    }
}
