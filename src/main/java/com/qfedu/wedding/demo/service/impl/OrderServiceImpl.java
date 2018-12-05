package com.qfedu.wedding.demo.service.impl;

import com.qfedu.wedding.demo.mapper.OrderMapper;
import com.qfedu.wedding.demo.pojo.Order;
import com.qfedu.wedding.demo.service.OrderService;
import com.qfedu.wedding.demo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findOrders(Integer userId) {

        return orderMapper.find(userId);
    }

    @Override
    public int addOrder(Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public int payman(Integer uid) {
        return orderMapper.updatestar(uid);
    }

    @Override
    public R addOrders(Order order) {
        R r = new R();
        int i = orderMapper.insertSelective(order);

        System.err.println("订单id:" + order.getOrderId());
        if (i > 0) {
            Order result = orderMapper.selectByPrimaryKey(order.getOrderId());
            r.setData(result);
            r.setMsg("success");
        } else {
            r.setMsg("error");
        }

        return r;
    }


}
