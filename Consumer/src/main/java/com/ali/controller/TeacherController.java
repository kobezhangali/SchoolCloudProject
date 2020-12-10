package com.ali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TeacherController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getTeacher")
    public String GetTeacherById(int id){

        return restTemplate.getForObject("http://teacherprovider/selectOne?id="+id,String.class);
    }

    @GetMapping("getAllTeacher")
    public String getAllTeacher(){
        return restTemplate.getForObject("http://teacherprovider/getAllTeacher",String.class);
    }
}
