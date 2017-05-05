package com.gt.examsystem.dto;

import org.hibernate.validator.constraints.NotBlank;


/**
 *
 * 登出请求DTO
 *
 * @author 郭涛
 *
 * @version 1.0
 *
 * @since 2017/4/18
 */
public class ReqLogoutDTO {

    /**
     * 登入账号
     */
    @NotBlank(message = "登入账号不能为空")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "[" +
                "account: " + userId +
                "]";
    }


}
