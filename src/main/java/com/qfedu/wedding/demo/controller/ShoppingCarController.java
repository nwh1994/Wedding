package com.qfedu.wedding.demo.controller;

import com.qfedu.wedding.demo.pojo.ShoppingCar;
import com.qfedu.wedding.demo.pojo.User;
import com.qfedu.wedding.demo.service.ShoppingCarService;
import com.qfedu.wedding.demo.vo.R;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
/*@RequestMapping("/api/v1/")*/
public class ShoppingCarController {
    @Autowired
    private ShoppingCarService shoppingCarService;

    @GetMapping("/shopCar1")
    public R shopCarList( Integer userId,HttpServletRequest req,HttpServletResponse resp) {
        // response对头部的设置有两个方法，一个add还有一个set
        resp.addHeader("Access-Control-Allow-Origin", "*");
        // 解决ie浏览器下的Bug
        resp.setContentType("text/html");
        System.out.println("11111");
        /*User user = (User) req.getSession().getAttribute("user");
        System.out.println(user.getUserId());*/
        System.out.println(userId);
        return shoppingCarService.shopCarList(userId);
    }

    @PostMapping("addCar")
    public void addCar(HttpServletResponse response, @Param("hotelId") int hotelId,
                      @Param("userId") int userId, @Param("num") int num,
                       @Param("price") int price) throws IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");

        ShoppingCar car = new ShoppingCar();
        car.setShopHotelId(hotelId);
        car.setShopNum(num);
        car.setShopPrice(price);
        car.setShopUserId(userId);

        int i = shoppingCarService.addCar(car);
        response.getWriter().print(i);
    }
    @PatchMapping("/shopCar")
    public R updateShopCar(ShoppingCar shoppingCar, HttpServletResponse resp) {
        // response对头部的设置有两个方法，一个add还有一个set
        resp.addHeader("Access-Control-Allow-Origin", "*");
        // 解决ie浏览器下的Bug
        resp.setContentType("text/html");

        return shoppingCarService.updateShopCarNum(shoppingCar);
    }

    @GetMapping("/selectByids")
    public R selectByids(@RequestParam("ids") Integer sid, HttpServletResponse resp) {
        // response对头部的设置有两个方法，一个add还有一个set
        resp.addHeader("Access-Control-Allow-Origin", "*");
        // 解决ie浏览器下的Bug
        resp.setContentType("text/html");

        return shoppingCarService.selectByIds(sid);
    }

    //根据sid删除数据
    @DeleteMapping("/shopCar")
    public R delete(@RequestParam("ids") Integer[] sids, HttpServletResponse resp) {
        // response对头部的设置有两个方法，一个add还有一个set
        resp.addHeader("Access-Control-Allow-Origin", "*");
        // 解决ie浏览器下的Bug
        resp.setContentType("text/html");
        System.out.println("0000000000");
        return shoppingCarService.deleteShopCar(sids);
    }

}
