package com.ali.controller;

import com.ali.entity.Student;
import com.ali.entity.StudentInfo;
import com.ali.entity.User;
import com.ali.service.StudentService;
import com.ali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-11-17 23:32:28
 */
@RestController

public class StudentController {
    /**
     * 服务对象
     */
    @Autowired
    private StudentService studentService;


    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

    @GetMapping(value = "selectOneBySid")
    public Student selectOne(@RequestParam(value = "id") int id) {
        return this.studentService.queryById(id);
    }


    @GetMapping("getStudentInfo")
    public StudentInfo getStudentInfo(int uid){

        return this.studentService.getStudentInfo(uid);

    }
    @GetMapping("queryByUid")
    public Student queryByUid(int uid){
        return this.studentService.queryByUid(uid);
    }

//    @PostMapping("updateStudent")
//    public Student updateStudent(Student student, User user){
//
//        this.userService.update(user);
//        return this.studentService.update(student);
//    }

    @PostMapping("updateStu")
    public Student updateStudent(@RequestBody Student student){

        return this.studentService.update(student);
    }

    @PostMapping("updateStuAndU")
    public Student updateStuAndTea(@RequestBody Map map){
        System.out.println(map);
        String u= (String) map.get("uid");
        int uid=Integer.parseInt(u);
        String s= (String) map.get("sid");
        int sid=Integer.parseInt(s);
        String tel= (String) map.get("tel");
        String addr=(String)map.get("addr");
        String pli=(String)map.get("pli");
        String hobby=(String)map.get("hobby");
    User user=new User();
    user.setUid(uid);
    user.setTel(tel);
    Student student=new Student();
    student.setAddr(addr);
    student.setHobby(hobby);
    student.setPlitical(pli);
    student.setSid(sid);

    restTemplate.postForObject("http://userProvider/updateUser",user,String.class);

        return this.studentService.update(student);

    }

    @PostMapping(value = "updateStudent")
    public Student updateStudent(@RequestPart(value = "student", required = false)Student student, @RequestPart(value = "user", required = false) User user){
        System.out.println(student);
        System.out.println(user);
        restTemplate.postForObject("http://userProvider/updateUser",user,String.class);

        return this.studentService.update(student);
    }

//    @PostMapping("updateStuAndU")
//    public Student updateStuAndTea(@RequestBody Map<Object,String> map){
//
//        restTemplate.postForObject("http://userProvider/update",map,String.class);
//
//        return this.studentService.update(map);
//
//    }

}