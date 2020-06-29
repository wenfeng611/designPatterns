package wenfeng.designpattern.state.example;

import wenfeng.designpattern.state.StatusType;

public class DepartmentLeaderNode extends ApprovalNode {

    @Override
    public void handle(FlowContext flowContext) {
        //部门领导人的节点
        System.out.println("部门领导人审批流程。。。");
        flowContext.setStatus(StatusType.DEPARTMENTAGREED.getCode());
        System.out.println("当前状态为： "+ StatusType.from(flowContext.getStatus()));
        //设置下一个流程状态节点为hr
        flowContext.setApprovalNode(new HRNode());
        flowContext.getApprovalNode().handle(flowContext);
    }
}
