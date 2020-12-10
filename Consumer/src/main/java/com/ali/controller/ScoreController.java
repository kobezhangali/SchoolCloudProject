package com.ali.controller;

import com.ali.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("score")
public class ScoreController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("selectO")
    public String selectOne(int id){
        return restTemplate.getForObject("http://scoreprovider/selectOne?id="+id,String.class);
    }
    @GetMapping("getScoreInfo")
    public String getScoreInfo(int uid){
        return restTemplate.getForObject("http://scoreprovider/getScoreInfo?uid="+uid,String.class);
    }

    @GetMapping("getScoreAndCou")
    public String getScoreAndCou(int uid){
        return restTemplate.getForObject("http://scoreprovider/getScoreAndCou?uid="+uid,String.class);
    }

    @GetMapping("getScoreAndCouPie")
    public String getScoreAndCouPie(int uid){
        return restTemplate.getForObject("http://scoreprovider/getScoreAndCouPie?uid="+uid,String.class);
    }
    @PostMapping("saveCourse")
    public String addCourse(Score score){
        return restTemplate.postForObject("http://scoreprovider/addCourse",score,String.class);
    }
}
