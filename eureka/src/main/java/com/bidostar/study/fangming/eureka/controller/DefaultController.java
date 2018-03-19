package com.bidostar.study.fangming.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangming
 * @createtime 2018-03-15 18:02
 */
@RestController
public class DefaultController {

    @GetMapping("/")
    public String help(){
        return "Hello,Eureka !";
    }


}
