package com.ali.controller;

import com.ali.entity.ClassInfo;
import com.ali.entity.Clazz;
import com.ali.service.ClazzService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Clazz)表控制层
 *
 * @author makejava
 * @since 2020-11-12 21:18:19
 */
@RestController

public class ClazzController {
    /**
     * 服务对象
     */
    @Resource
    private ClazzService clazzService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Clazz selectOne(Integer id) {
        return this.clazzService.queryById(id);
    }

    @GetMapping("getClassInfo")
    public List<ClassInfo> getClassInfo(int uid){
        return this.clazzService.getClassInfo(uid);
    }
}