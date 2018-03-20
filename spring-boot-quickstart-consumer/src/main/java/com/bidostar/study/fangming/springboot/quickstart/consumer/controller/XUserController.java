package com.bidostar.study.fangming.springboot.quickstart.consumer.controller;

import com.bidostar.study.fangming.springboot.quickstart.consumer.model.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/xuser")
public class XUserController {


    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return null;
    }

    @GetMapping("/user-instance")
    public List<InstanceInfo> showInfo(){
        List<InstanceInfo> instanceInfos = this.eurekaClient.getApplication("spring-boot-quickstart").getInstances();
        return instanceInfos;
    }
}
