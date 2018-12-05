package com.qfedu.wedding.demo.mapper;

import com.qfedu.wedding.demo.pojo.ShoppingCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShoppingCarMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer shopId);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar record);

    //购物车信息
    List<Map<Object,Integer>> selectShopCar(@Param("userId") Integer userId);
    /*int delShopCar(String[] ids);*/

    //查询选中id的商品
    Map<Object,String> selectByIds(/*Integer userId, */Integer sid);

    //根据userID和sid删除数据
    int deleteShopCar(Integer[] sids);

}