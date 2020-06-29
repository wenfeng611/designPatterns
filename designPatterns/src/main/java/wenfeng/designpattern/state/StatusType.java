package wenfeng.designpattern.state;

public enum StatusType {
    DEFAULT(0,"默认"),
    SUBMITED(1,"已提交"),
    DEPARTMENTAGREED(2,"部门已审批"),
    HRAGREED(3,"hr已审批");


    private int code;
    private String msg;

    StatusType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String from(int code){
        for (StatusType value : StatusType.values()) {
            if(value.code == code) return value.msg;
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
