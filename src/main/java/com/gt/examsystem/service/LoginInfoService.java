package com.gt.examsystem.service;

import com.gt.examsystem.entity.LoginInfo;
import org.springframework.stereotype.Service;

/**
 * Created by wangxy on 2017/4/18.
 */

@Service
public interface LoginInfoService {

    /**
     * 插入登录日志
     *
     * @param loginInfo
     * @return
     */
    Integer insertLoginInfo( LoginInfo loginInfo );
}
