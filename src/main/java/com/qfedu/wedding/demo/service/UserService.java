package com.qfedu.wedding.demo.service;

import com.qfedu.wedding.demo.pojo.User;
import com.qfedu.wedding.demo.vo.R;

public interface UserService {
    User login(String userUsername, String userPassword);
    boolean saveUser(User user);

    boolean selectName(String userUsername);
    //根据用户id查询用户信息
    User selectByUserId(Integer userId);

    R updateByUserId(User user);
}
