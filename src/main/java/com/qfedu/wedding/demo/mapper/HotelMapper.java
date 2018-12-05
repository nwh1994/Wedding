package com.qfedu.wedding.demo.mapper;

import com.qfedu.wedding.demo.pojo.Hotel;


import java.util.List;

public interface HotelMapper {
    int deleteByPrimaryKey(Integer hotelId);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Integer hotelId);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);

    List<Hotel> selectAll();

    Hotel selectHotelById(int id);
}