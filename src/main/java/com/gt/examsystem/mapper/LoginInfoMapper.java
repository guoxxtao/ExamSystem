package com.gt.examsystem.mapper;

import com.gt.examsystem.entity.LoginInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by guotao on 2017/5/4.
 */
public interface LoginInfoMapper {
    /**
     * 插入登录日志
     *
     * @param loginInfo
     * @return
     */

    public Integer insertLoginInfo(@Param("loginInfo") LoginInfo loginInfo);


}
