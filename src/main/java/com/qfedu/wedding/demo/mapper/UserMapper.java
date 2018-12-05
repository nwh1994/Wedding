package com.qfedu.wedding.demo.mapper;


import com.qfedu.wedding.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUser(@Param("userUsername") String userUsername, @Param("userPassword") String userPassword);

    int selectName(String userUsername);
}