package com.gt.examsystem.dto;

/**
 *
 * 返回参数统一范例
 *
 * @author wangxy
 *
 * @version 1.0
 *
 * @since 2017/3/29
 *
 */
public class ResBaseDTO<T> {

    /**
     * 操作结果码
     * 0表示正常，-1表示失败
     */
    private Integer flag;

    /**
     * 结果描述
     * 在ret=-1时描述错误原因
     */
    private String message;

    private T data;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[" +
                "flag: " + flag +
                ", message: " + message +
                ", data: " + data +
                "]";
    }

}