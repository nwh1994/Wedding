package com.qfedu.wedding.demo.controller;

import com.qfedu.wedding.demo.pojo.Order;
import com.qfedu.wedding.demo.service.OrderService;
import com.qfedu.wedding.demo.vo.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("orders")
    public List<Order> findOrderss(Integer userId, HttpServletResponse response){

        response.addHeader("Access-Control-Allow-Origin","*");

        return orderService.findOrders(userId);
    }

    @PostMapping("buy")
    public void buy(HttpServletResponse response, @Param("hid")int hid,
                    @Param("uid") int uid,@Param("count")String count,
                    @Param("maney")int maney) throws IOException {
        response.addHeader("Access-Control-Allow-Origin","*");
        Integer orderNum = (int)(Math.random() * 1000000000);

        Order order = new Order();
        order.setOrderCount(count);
        order.setOrderHotelId(hid);
        order.setOrderMoney(maney);
        order.setOrderUserId(uid);
        order.setOrderStatus(0);
        order.setOrderNum(orderNum);

        int i = orderService.addOrder(order);

        response.getWriter().print(i);

    }

    @GetMapping("update")
    public void statr(HttpServletResponse response,Integer uid) throws IOException {
        response.addHeader("Access-Control-Allow-Origin","*");
        int i = orderService.payman(uid);
        response.getWriter().print(i);

    }
    @PostMapping("/order")
    public R addOrder(Order order, HttpServletResponse resp) {
        // response对头部的设置有两个方法，一个add还有一个set
        resp.addHeader("Access-Control-Allow-Origin", "*");
        // 解决ie浏览器下的Bug
        resp.setContentType("text/html");
        /* Integer orderNum = new Random().nextInt(6);*/
        Integer orderNum = (int) (Math.random() * 1000000000);
        order.setOrderNum(orderNum);
        System.out.println(order);
        return orderService.addOrders(order);
    }


}
