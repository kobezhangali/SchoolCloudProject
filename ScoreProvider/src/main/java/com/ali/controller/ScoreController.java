package com.ali.controller;

import com.ali.entity.CouAndSoc;
import com.ali.entity.Score;
import com.ali.entity.ScoreInfo;

import com.ali.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Score)表控制层
 *
 * @author makejava
 * @since 2020-11-12 21:19:12
 */
@RestController

public class ScoreController {

    /**
     * 服务对象
     */
    @Resource
    private ScoreService scoreService;

//    @Resource
//    private CouService couService;
//
//    @Resource
//    private CourseService courseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Score selectOne(Integer id) {
        return this.scoreService.queryById(id);
    }


    @GetMapping("getScoreInfo")
    public List<ScoreInfo> getScoreInfo(int uid){
        return this.scoreService.getScoreInfo(uid);
    }

//    @PostMapping("addCourse")
//    public int addCourse(Score score, User user){
//        int b=user.getUid();
//        int a=score.getCouid();
//        int c=score.getSid();
//        if(this.couService.queryById(a)!=null){
//            if(this.courseService.getCourseByUC(b,a)==null){
//                  this.scoreService.addCourse(score);
//            }
//            }
//        return 0;
//        }
    @GetMapping("getScoreAndCou")
    public Map<String,Object> getScoreAndCou(int uid){
        HashMap<String,Object> map=new HashMap<>();
        List<CouAndSoc> list=this.scoreService.getScoreAndCou(uid);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Object> count = new ArrayList<>();
        for (CouAndSoc s : list) {
            System.out.println(s);
            name.add(s.getCouname());
            count.add(s.getTotal());
        }

        map.put("name",name);
        map.put("count",count);
        return map;
    }
    @GetMapping("getScoreAndCouPie")
    public Map<String,Object> getScoreAndCouPie(int uid){
        List<CouAndSoc> list=this.scoreService.getScoreAndCou(uid);
        HashMap<String,Object> map1=new HashMap<>();
        ArrayList<Object> list1 = new ArrayList<>();

        for (CouAndSoc s : list) {
            HashMap<String,Object> map=new HashMap<>();
            map.put("name",s.getCouname());
            map.put("value",s.getTotal());
            list1.add(map);

        }

        System.out.println(list1);
        map1.put("name","name");
        map1.put("num",list1);
        return map1;
    }

    @PostMapping("addCourse")
    public int addCourse(@RequestBody Score score){
        return scoreService.addCourse(score);
    }
}