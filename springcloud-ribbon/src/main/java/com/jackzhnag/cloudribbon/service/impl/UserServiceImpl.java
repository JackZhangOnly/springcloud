package com.jackzhnag.cloudribbon.service.impl;

import com.jackzhnag.cloudribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jack
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String findUserById(String userId) {
        return restTemplate.getForObject("http://eureka-user-service/user/findUserById.do?id=1",String.class);
    }
}
