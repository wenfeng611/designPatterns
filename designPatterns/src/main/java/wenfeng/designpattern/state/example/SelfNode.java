package wenfeng.designpattern.state.example;

import wenfeng.designpattern.state.StatusType;

public class SelfNode extends ApprovalNode {

    @Override
    public void handle(FlowContext flowContext) {
        //自己提交流程的节点
        System.out.println("提交流程，内容为： "+flowContext.getConent());
        flowContext.setStatus(StatusType.SUBMITED.getCode());
        System.out.println("当前状态为： "+StatusType.from(flowContext.getStatus()));
        //设置下一个流程状态节点为部门领导
        flowContext.setApprovalNode(new DepartmentLeaderNode());
        flowContext.getApprovalNode().handle(flowContext);
    }
}
