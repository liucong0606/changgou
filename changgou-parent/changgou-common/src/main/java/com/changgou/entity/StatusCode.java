package com.changgou.entity;

/**
 * 返回码
 */
public enum StatusCode {
    OK("成功", 20000),
    ERROR("失败", 20001),
    LOGINERROR("用户名或密码错误", 20002),
    ACCESSERROR("权限不足", 20003),
    REMOTEERROR("远程调用失败", 20004),
    REPERROR("重复操作", 20005),
    NOTFOUNDERROR("没有对应的抢购数据", 20006);

    private final int code;
    private final String desc;

    private StatusCode(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
