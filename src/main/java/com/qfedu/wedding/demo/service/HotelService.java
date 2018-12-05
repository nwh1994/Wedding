package com.qfedu.wedding.demo.service;

import com.qfedu.wedding.demo.pojo.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> all();

    Hotel show(int id);
}
