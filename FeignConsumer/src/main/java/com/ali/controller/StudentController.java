package com.ali.controller;

import com.ali.Icontroller.StudentInterfaceController;
import com.ali.entity.Student;
import com.ali.entity.StudentInfo;
import com.ali.entity.User;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentInterfaceController studentInterfaceController;
    @RequestMapping(value = "selectOne", method = RequestMethod.GET)
    public Student getStudentByUid(@RequestParam(value = "id")int id){
        System.out.println(id);
        return studentInterfaceController.getStudent(id);
    }

    @RequestMapping(value = "selectInfo",method = RequestMethod.GET)
    public StudentInfo getStudentInfo(@RequestParam(value = "uid")int uid){
        return studentInterfaceController.getStudentInfo(uid);
    }


    @RequestMapping(value = "updateStu",method = RequestMethod.POST)
    public Student updateStu(Student student){

        return studentInterfaceController.updateStu(student);
    }

//    @RequestMapping(value = "updqteStudent",method = RequestMethod.POST)
//    public Student updqteStudent(Student student, User user){
//        System.out.println(student);
//        System.out.println(user);
//        return studentInterfaceController.updateStudent(student,user);
//    }
}
