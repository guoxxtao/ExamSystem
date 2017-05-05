package com.gt.examsystem.service.impl;

import com.gt.examsystem.mapper.UserMapper;
import com.gt.examsystem.entity.User;
import com.gt.examsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        // TODO Auto-generated method stub
        List<User> findAllUser = userMapper.findAllUser();

        return findAllUser;
    }
}