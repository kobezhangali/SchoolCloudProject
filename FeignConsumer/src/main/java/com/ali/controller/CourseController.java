package com.ali.controller;

import com.ali.Icontroller.CourseInterfaceController;
import com.ali.entity.CourseAll;
import com.ali.entity.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseInterfaceController courseInterfaceController;

    @RequestMapping(value = "getCourseInfo", method = RequestMethod.GET)
    public List<CourseInfo> getCourseInfo(@RequestParam("uid") int uid){
        return courseInterfaceController.getCourseInfo(uid);
    }
    @RequestMapping(value = "getCourseByUC", method = RequestMethod.GET)
    public CourseInfo getCourseByUC(@RequestParam("uid") int uid,@RequestParam("couid")int couid){
        return courseInterfaceController.getCourseByUC(uid,couid);
    }
    @RequestMapping(value = "getCourseAll", method = RequestMethod.GET)
    public List<CourseAll> getCourseAll(){
        return courseInterfaceController.getCourseAll();
    }
}
