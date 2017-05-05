package com.gt.examsystem.dto;

import org.hibernate.validator.constraints.NotBlank;


/**
 * 登录请求DTO
 *
 * @author 郭涛
 * @version 1.0
 * @since 2017/4/18
 */
public class ReqLoginDTO {

    /**
     * 263账号
     */
    @NotBlank(message = "账号不能为空")
    private String userId;

    /**
     * 登录密码
     */
    @NotBlank(message = "登录密码不能为空")
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "[" +
                "account: " + userId +
                ", password: " + password +
                "]";
    }
}
