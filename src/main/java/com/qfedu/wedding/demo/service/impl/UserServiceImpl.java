package com.qfedu.wedding.demo.service.impl;

import com.qfedu.wedding.demo.mapper.UserMapper;
import com.qfedu.wedding.demo.pojo.User;
import com.qfedu.wedding.demo.service.UserService;
import com.qfedu.wedding.demo.util.RUtil;
import com.qfedu.wedding.demo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String userUsername, String userPassword) {
        return userMapper.selectUser(userUsername,userPassword);
    }
    @Override
    public boolean saveUser(User user) {
        return userMapper.insertSelective(user)==0?false:true;
    }

    @Override
    public boolean selectName(String userUsername) {
        int i  = userMapper.selectName(userUsername);
        if (i==0){
            return true;
        }else {
            return false;
        }

    }
    @Override
    public User selectByUserId(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    //修改用户信息
    @Override
    public R updateByUserId(User user) {
        return userMapper.updateByPrimaryKeySelective(user) > 0 ? RUtil.setOK("success") : RUtil.setERROR("error");
    }
}
