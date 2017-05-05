package com.gt.examsystem.controller;

import com.gt.examsystem.entity.User;
import com.gt.examsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by guotao on 2017/5/3.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    @ResponseBody
    public List<User> findAllUser() {
        List<User> listUser = userService.findAllUser();

        return listUser;
    }
}