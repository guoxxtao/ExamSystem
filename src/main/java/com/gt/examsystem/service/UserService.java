package com.gt.examsystem.service;

import com.gt.examsystem.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guotao on 2017/5/3.
 */

@Service
public interface UserService {
    List<User> findAllUser();
}