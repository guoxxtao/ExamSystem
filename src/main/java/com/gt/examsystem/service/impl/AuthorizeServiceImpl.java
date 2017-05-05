package com.gt.examsystem.service.impl;

import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.dto.ResLoginDTO;
import com.gt.examsystem.entity.LoginInfo;
import com.gt.examsystem.mapper.AuthorizeMapper;
import com.gt.examsystem.service.AuthorizeService;
import com.gt.examsystem.service.LoginInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * 登录考试系统的Service的实现
 *
 * @author 郭涛
 * @version 1.0
 * @since 2017/5/4
 */

@Service("authorizeServiceImpl")
public class AuthorizeServiceImpl implements AuthorizeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizeServiceImpl.class);

    @Autowired
    private AuthorizeMapper authorizeMapper;

    @Autowired
    @Qualifier("loginInfoServiceImpl")
    private LoginInfoService loginInfoService;

    @Override
    public ResBaseDTO<ResLoginDTO> login( String userId, String password ) {

        ResLoginDTO resLoginDTO = new ResLoginDTO();
        ResBaseDTO<ResLoginDTO> resBaseDTO = new ResBaseDTO<ResLoginDTO>();
        Integer flag;
        String message;
        //登录账号验证
        Integer userType = authorizeMapper.validateUser(userId, password);
        if (userType != null) {
            flag = 1;
            message = "登录成功";
            resLoginDTO.setUserType(userType);
        } else {
            flag = 0;
            message = "登录账号或密码错误";
        }
        //记录登录日志
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setLoginAccount(userId);
        loginInfo.setLoginAction(message);
        loginInfoService.insertLoginInfo(loginInfo);

        resBaseDTO.setFlag(flag);
        resBaseDTO.setMessage(message);
        resBaseDTO.setData(resLoginDTO);
        return resBaseDTO;
    }

    @Override
    public ResBaseDTO<String> logout( String userId ) {
        String message = "登出成功";
        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();
        resBaseDTO.setFlag(1);
        resBaseDTO.setMessage(message);
        resBaseDTO.setData("");

        //记录登出日志
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setLoginAccount(userId);
        loginInfo.setLoginAction(message);
        loginInfoService.insertLoginInfo(loginInfo);
        return resBaseDTO;
    }
}
