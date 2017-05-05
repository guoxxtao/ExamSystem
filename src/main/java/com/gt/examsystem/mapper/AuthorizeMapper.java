package com.gt.examsystem.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by guotao on 2017/5/4.
 */
public interface AuthorizeMapper {

    public Integer validateUser( @Param("userId") String userId, @Param("password") String password );

}
