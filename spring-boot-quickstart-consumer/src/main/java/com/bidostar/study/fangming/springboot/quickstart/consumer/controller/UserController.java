package com.bidostar.study.fangming.springboot.quickstart.consumer.controller;

import com.bidostar.study.fangming.springboot.quickstart.consumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = restTemplate.getForObject(userServiceUrl,User.class,id);
        return user;
    }
}
