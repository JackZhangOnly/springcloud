package com.jackzhang.cloudfeign.controller;

import com.jackzhang.cloudfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 例如在订单服务中去拿到用户信息
 * Created by Jack
 */
@RestController
@RequestMapping(value = "/order/")
public class OrderController {
    @Autowired
    private UserService userService;

    @RequestMapping(value ="getOrderUser.do")
    public String getOrder(){
       return userService.findUserById("12324");
    }
}
