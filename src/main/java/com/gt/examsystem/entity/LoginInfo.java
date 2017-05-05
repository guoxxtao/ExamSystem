package com.gt.examsystem.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by 郭涛 on 2017/4/17 0017.
 */
public class LoginInfo {
    /**
     * 主键id
     */
    private BigInteger id;

    /**
     * 登录账号
     */
    private String loginAccount;

    /**
     * 登录行为
     */
    private String loginAction;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginAction() {
        return loginAction;
    }

    public void setLoginAction(String loginAction) {
        this.loginAction = loginAction;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
