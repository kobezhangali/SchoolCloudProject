package com.ali.controller;

import com.ali.Icontroller.TeacherInterfaceController;
import com.ali.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignTeacherController {
    @Autowired
    private TeacherInterfaceController teacherInterfaceController;
    @RequestMapping(value = "getTeacher", method = RequestMethod.GET)
    public Teacher getTeacher(@RequestParam(value = "id")int id){

        return teacherInterfaceController.getTeacher(id);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Teacher> getAllTeacher(){
        return teacherInterfaceController.getAllTeacher();
    }
}
