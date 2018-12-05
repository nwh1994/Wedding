package com.qfedu.wedding.demo.service.impl;

import com.qfedu.wedding.demo.mapper.HotelMapper;
import com.qfedu.wedding.demo.pojo.Hotel;
import com.qfedu.wedding.demo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper mapper;

    @Override
    public List<Hotel> all() {

        return mapper.selectAll();
    }

    @Override
    public Hotel show(int id) {
        return mapper.selectHotelById(id);
    }
}
