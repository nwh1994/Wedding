package com.qfedu.wedding.demo.service.impl;

import com.qfedu.wedding.demo.mapper.ShoppingCarMapper;
import com.qfedu.wedding.demo.pojo.ShoppingCar;
import com.qfedu.wedding.demo.service.ShoppingCarService;
import com.qfedu.wedding.demo.util.RUtil;
import com.qfedu.wedding.demo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;

    @Override
    public R shopCarList(Integer userId) {
      List<Map<Object, Integer>> list =  shoppingCarMapper.selectShopCar(userId);
        R r = new R();
        if ( list != null ) {
           r.setCode(1000);
           r.setMsg("success");
           r.setData(list);
        } else {
            r.setCode(2000);
            r.setMsg("error");
        }
        return r;
    }

    @Override
    public int addCar(ShoppingCar car) {
        return shoppingCarMapper.insertSelective(car);
    }
    @Override
    public R updateShopCarNum(ShoppingCar shoppingCar) {
        return shoppingCarMapper.updateByPrimaryKeySelective(shoppingCar) > 0 ? RUtil.setOK("success") : RUtil.setERROR("error");
    }

    @Override
    public R selectByIds(/*@RequestParam("userId") Integer userId, */@RequestParam("ids") Integer sid) {
        Map<Object, String> map = shoppingCarMapper.selectByIds(/*userId,*/sid);

        R r = new R();

        if (map != null) {
            r = new R();
            r.setCode(1000);
            r.setMsg("success");
            r.setData(map);
        } else {
            r.setMsg("error");
        }
        return r;
    }

    //sid删除数据
    public R deleteShopCar(Integer[] sids) {
        return shoppingCarMapper.deleteShopCar(sids) > 0 ? RUtil.setOK("success") : RUtil.setERROR("error");
    }

}
