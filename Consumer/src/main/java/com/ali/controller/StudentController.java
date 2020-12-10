package com.ali.controller;

import com.ali.entity.Student;
import com.ali.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("selectOneBySid")
    public String selectOneBySid(int sid){
        return restTemplate.getForObject("http://studentProvider/selectOneBySid?id="+sid,String.class);
    }
    @GetMapping("getStudentInfo")
    public String getStudentInfo(int uid){
        return restTemplate.getForObject("http://studentProvider/getStudentInfo?uid="+uid,String.class);
    }

    @GetMapping("queryByUid")
    public String queryByUid(int uid){
        return restTemplate.getForObject("http://studentProvider/queryByUid?uid="+uid,String.class);
    }
    @PostMapping("updateStudent")
    public Student updateStudent(Student student, User user){

       String uid= String.valueOf(user.getUid());

        String sid=String.valueOf(student.getSid());
        String tel=user.getTel();
        String addr=student.getAddr();
        String pli=student.getPlitical();
        String hobby=student.getHobby();
        Map<String,String> map=new HashMap();
        map.put("uid",uid);
        map.put("sid",sid);
        map.put("tel",tel);
        map.put("addr",addr);
        map.put("pli",pli);
        map.put("hobby",hobby);
        return restTemplate.postForObject("http://studentProvider/updateStuAndU",map,Student.class);
    }

}
