package com.qfedu.wedding.demo.controller;

import com.qfedu.wedding.demo.pojo.User;
import com.qfedu.wedding.demo.service.UserService;
import com.qfedu.wedding.demo.vo.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

  @PostMapping("login")
    public User login( @Param("userUsername") String userUsername,@Param("userPassword") String userPassword, HttpServletResponse response, HttpSession session) throws IOException {

      response.addHeader("Access-Control-Allow-Origin","*");
      System.out.println("1234567");
      return  userService.login(userUsername,userPassword);
   /*   User user =userService.login(userUsername,userPassword);
      if (user!=null){
          System.out.println("keyi");
      }else {
          System.out.println("bu");
      }*/


    }
    @PostMapping("regist")
    public void regist(User user, HttpServletResponse response) throws IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        boolean b = userService.saveUser(user);
        System.out.println(b);
        response.getWriter().print(b);
    }

    @GetMapping("selectName")
    public void selectName(String userUsername, HttpServletResponse response) throws IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        boolean b = userService.selectName(userUsername);
        System.out.println(b);
        response.getWriter().print(b);

    }
    @GetMapping("/user")
    public User selectByUserId(Integer userId,HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin","*");
        return userService.selectByUserId(userId);
    }

    //修改用户信息
    @PatchMapping("/user")
    public R updateByUserId(User user, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin","*");
        return userService.updateByUserId(user);
    }
}
