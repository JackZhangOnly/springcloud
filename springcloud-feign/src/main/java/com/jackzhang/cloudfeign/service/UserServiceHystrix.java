package com.jackzhang.cloudfeign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jack on 2017/12/3.
 */
@Component
public class UserServiceHystrix implements UserService{
    @Override
    public String findUserById(@RequestParam(value = "userId") String userId) {
        return "sorry "+userId+" service is down";
    }
}
