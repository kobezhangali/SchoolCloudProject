package com.ali.controller;

import com.ali.entity.*;

import com.ali.excel.WriteXLS;
import com.ali.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2020-11-17 23:32:27
 */
@RestController

public class CourseController {
    @Autowired
    private WriteXLS writeXLS;
    /**
     * 服务对象
     */
    @Autowired
    private CourseService courseService;
    @Autowired
    private RestTemplate restTemplate;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Course selectOne(Integer id) {
        return this.courseService.queryById(id);
    }
    @GetMapping("getCourseInfo")
    public List<CourseInfo> getCourseInfo(int uid){
        return this.courseService.getCourseInfo(uid);
    }
    @GetMapping("getCourseAll")
    public List<CourseAll> getCourseAll(){
        return this.courseService.getCourseAll();
    }
    @GetMapping("getCourseByUC")
    public CourseInfo getCourseByUC(int uid,int couid){
        return this.courseService.getCourseByUC(uid,couid);
    }

    @PostMapping("saveCourse")
    public int addCourse(@RequestBody Map map){

        System.out.println(map);
        int b=(int)map.get("uid");
        int a=(int)map.get("couid");
        int c=(int)map.get("sid");
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        Score score=new Score();
        score.setCouid(a);
        score.setSid(c);
        String cou=restTemplate.getForObject("http://couprovider/selectOne?id="+a,String.class);
        if(cou!=null){
            if(this.courseService.getCourseByUC(b,a)==null){
                restTemplate.postForObject("http://scoreprovider/addCourse",score,String.class);
                return 1;
            }
        }
        return 0;
    }
    @GetMapping("writeXLS")
    public String writeXLS(int uid){
        List<CourseInfo> list= this.courseService.getCourseInfo(uid);
        writeXLS.exportExcel (list);
        return "成功";
    }
}