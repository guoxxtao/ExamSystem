package com.gt.examsystem.entity;

/**
 * Created by guotao on 2017/5/4.
 */
public class UserInfo {

    private String userId;
    private String userName;
    private Integer userType;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType( Integer userType ) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }


}
