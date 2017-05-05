package com.gt.examsystem.dto;

/**
 * Created by guotao on 2017/5/5.
 */
public class ResLoginDTO {

    Integer userType;

    public Integer getUserType() {
        return userType;
    }

    public void setUserType( Integer userType ) {
        this.userType = userType;
    }

    @Override
    public String toString ( ){

        return "[userType :" + userType + "]";
    }
}
