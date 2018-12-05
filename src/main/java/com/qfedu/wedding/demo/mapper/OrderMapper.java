package com.qfedu.wedding.demo.mapper;

import com.qfedu.wedding.demo.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> find(@Param("userId") Integer userId);

    int updatestar(Integer uid);

    //int updateStatus(@Param("orderNum") Integer orderNum, @Param("orderStatus") Integer orderStatus);
}

