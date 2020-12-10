package com.ali.controller;

import com.ali.entity.Score;
import com.ali.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getCourseInfo")
    public String getCourseInfo(int uid){
        return restTemplate.getForObject("http://courseprovider/getCourseInfo?uid="+uid,String.class);
    }
    @GetMapping("getCourseAll")
    public String getCourseAll(){
        return restTemplate.getForObject("http://courseprovider/getCourseAll",String.class);
    }
    @GetMapping("getCourseByUC")
    public String getCourseByUC(int uid,int couid){
        return restTemplate.getForObject("http://courseprovider/getCourseByUC?uid="+uid+"&couid="+couid,String.class);
    }
    @PostMapping("addCourse")
    public String addCourse( Score score, User user){

        Map<String, Integer> map=new HashMap<>();
        map.put("uid",user.getUid());
        map.put("couid",score.getCouid());
        map.put("sid",score.getSid());
        System.out.println(map);
        return restTemplate.postForObject("http://courseprovider/saveCourse",map,String.class);
    }
    @GetMapping("writeXLS")
    public String writeXLS(int uid){
        return restTemplate.getForObject("http://courseprovider/writeXLS?uid="+uid,String.class);
    }
}
