package com.jackzhang.cloudfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**OrderController
 * Created by Jack
 */
@FeignClient(value = "eureka-user-service")
public interface UserService {

    @RequestMapping(value = "/user/findUserById.do",method = RequestMethod.GET)
    String findUserById(@RequestParam(value = "userId") String userId);
}
