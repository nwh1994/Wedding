package com.qfedu.wedding.demo.service;

import com.qfedu.wedding.demo.pojo.Order;
import com.qfedu.wedding.demo.vo.R;

import java.util.List;

public interface OrderService {
    List<Order> findOrders(Integer userId);

    int addOrder(Order record);

    int payman(Integer uid);

    R addOrders(Order order);
}
