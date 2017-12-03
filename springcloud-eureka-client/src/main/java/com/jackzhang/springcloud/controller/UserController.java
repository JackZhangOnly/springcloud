package com.jackzhang.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jack
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @RequestMapping(value = "findUserById.do",method = RequestMethod.GET)
    public String findUserById(String userId){
        return "{\n" +
                "\"id\":\"1111\",\n" +
                "\"username\":\"springcloud\"\n" +
                "}";
    }
}
