package com.ali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("clazz")
public class ClazzController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getClassInfo")
    public String getClassInfo(int uid){
        return restTemplate.getForObject("http://clazzprovider/getClassInfo?uid="+uid,String.class);
    }

}
