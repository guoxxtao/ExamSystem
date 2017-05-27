package com.gt.examsystem.controller;

import com.gt.examsystem.dto.ReqLoginDTO;
import com.gt.examsystem.dto.ReqLogoutDTO;
import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.dto.ResLoginDTO;
import com.gt.examsystem.service.AuthorizeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 登录平台的Controller
 *
 * @author wangxy
 * @version 1.0
 * @since 2017/4/18
 */
@Controller
@RequestMapping("/authorize")
public class AuthorizeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizeController.class);


    @Autowired
    @Qualifier("authorizeServiceImpl")
    private AuthorizeService authorizeService;

    /**
     * 使用账号登录平台
     *
     * @param loginDTO 登录请求DTO
     * @return ResBaseDTO
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<ResLoginDTO> login( @RequestBody @Validated ReqLoginDTO loginDTO, BindingResult bindingResult, HttpSession httpSession ) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("login(loginDTO = {}) - start", loginDTO);
        }

        ResBaseDTO<ResLoginDTO> resBaseDTO = new ResBaseDTO<ResLoginDTO>();

        if (bindingResult.hasErrors()) {
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage(bindingResult.getAllErrors().get(0).getDefaultMessage());
            resBaseDTO.setData(null);

        } else {
            String userId = loginDTO.getUserId();
            String password = loginDTO.getPassword();
            resBaseDTO = authorizeService.login(userId, password);
            httpSession.setAttribute("userType", resBaseDTO.getData().getUserType());
            httpSession.setAttribute("userId", userId);
            httpSession.setAttribute("isLogin", 1);
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("login(resBaseDTO = {}) - end", resBaseDTO);
        }
        return resBaseDTO;
    }

    /**
     * 登出登录平台
     *
     * @param logoutDTO 登出请求DTO
     * @return ResBaseDTO
     */
    @RequestMapping(value = "/logout.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<String> logout( @RequestBody @Validated ReqLogoutDTO logoutDTO, BindingResult bindingResult, HttpSession httpSession ) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("logout(logoutDTO = {}) - start", logoutDTO);
        }

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

        if (bindingResult.hasErrors()) {
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage(bindingResult.getAllErrors().get(0).getDefaultMessage());
            resBaseDTO.setData("");
        } else {
            String userId = logoutDTO.getUserId();
            resBaseDTO = authorizeService.logout(userId);

            httpSession.removeAttribute("userId");
            httpSession.removeAttribute("userType");
            httpSession.removeAttribute("isLogin");
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("logout(resBaseDTO = {}) - end", resBaseDTO);
        }
        return resBaseDTO;
    }
}
