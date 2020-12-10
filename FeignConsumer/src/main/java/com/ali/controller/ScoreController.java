package com.ali.controller;

import com.ali.Icontroller.ScoreInterfaceController;
import com.ali.entity.Score;
import com.ali.entity.ScoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ScoreController {
    @Autowired
    private ScoreInterfaceController scoreInterfaceController;
    @GetMapping("selectO")
    public Score selectOne(int id){
        return scoreInterfaceController.selectOne(id);
    }
    @GetMapping("getScoreInfo")
    public List<ScoreInfo> getScoreInfo(int uid){
        return scoreInterfaceController.getScoreInfo(uid);
    }
    @GetMapping("getScoreAndCou")
    public Map<String,Object> getScoreAndCou(int uid){
        return scoreInterfaceController.getScoreAndCou(uid);
    }
    @GetMapping("getScoreAndCouPie")
    public Map<String,Object> getScoreAndCouPie(int uid){
        return scoreInterfaceController.getScoreAndCouPie(uid);
    }
}
