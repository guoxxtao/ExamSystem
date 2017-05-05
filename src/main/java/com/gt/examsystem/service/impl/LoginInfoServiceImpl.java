package com.gt.examsystem.service.impl;


import com.gt.examsystem.entity.LoginInfo;
import com.gt.examsystem.mapper.LoginInfoMapper;
import com.gt.examsystem.service.LoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangxy on 2017/4/18.
 */

@Service("loginInfoServiceImpl")
public class LoginInfoServiceImpl implements LoginInfoService {

    @Autowired
    LoginInfoMapper loginInfoMapper;


    public Integer insertLoginInfo(LoginInfo loginInfo) {
        return loginInfoMapper.insertLoginInfo(loginInfo);
    }
}
