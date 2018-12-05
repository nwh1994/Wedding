package com.qfedu.wedding.demo.controller;

import com.qfedu.wedding.demo.pojo.Hotel;
import com.qfedu.wedding.demo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelService service;

    @GetMapping("hotels")
    public List<Hotel> all(HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return service.all();
    }

    @GetMapping("hotel")
    public Hotel show(HttpServletResponse response,int id){
       
        response.addHeader("Access-Control-Allow-Origin","*");
        return service.show(id);
    }
}
