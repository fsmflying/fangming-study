package com.bidostar.study.fangming.springboot.quickstart.controller;

import com.bidostar.study.fangming.springboot.quickstart.dao.UserRepository;
import com.bidostar.study.fangming.springboot.quickstart.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fangming
 * @createtime: 2018-03-16 11:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
