package com.gt.examsystem.service;

import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.dto.ResLoginDTO;
import org.springframework.stereotype.Service;

/**
 * 登录考试系统的Service
 *
 * @author 郭涛
 * @since 2017/5/4
 */

@Service("authorizeService")
public interface AuthorizeService {

    /**
     * 登录平台
     *
     * @param userId   登录账号
     * @param password 登录密码
     * @return ResBaseDTO
     */
    ResBaseDTO<ResLoginDTO> login( String userId, String password );

    /**
     * 登出平台
     *
     * @param userId 已登录的账号
     * @return ResBaseDTO
     */
    ResBaseDTO<String> logout( String userId );
}
