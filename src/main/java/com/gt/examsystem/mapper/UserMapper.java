package com.gt.examsystem.mapper;

import com.gt.examsystem.entity.User;

import java.util.List;

public interface UserMapper {


    List<User> findAllUser();
}