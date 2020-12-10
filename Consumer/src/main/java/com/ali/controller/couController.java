package com.ali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class couController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("selectOneByUid")
    public String selctOne(int id){
        return restTemplate.getForObject("http://couprovider/selectOne?id="+id,String.class);
    }
}
