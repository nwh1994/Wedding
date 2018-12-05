package com.qfedu.wedding.demo.service;

import com.qfedu.wedding.demo.pojo.ShoppingCar;
import com.qfedu.wedding.demo.vo.R;
import org.springframework.web.bind.annotation.RequestParam;


public interface ShoppingCarService {
    R shopCarList(Integer userId);

    int addCar(ShoppingCar car);
    R updateShopCarNum(ShoppingCar shoppingCar);

    //查询选中id的商品
    R selectByIds(/*@RequestParam("userId") Integer userId,*/ @RequestParam("ids") Integer sid);

    //根据sid删除数据
    R deleteShopCar(Integer[] sids);

}
