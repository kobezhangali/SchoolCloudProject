package com.ali.controller;

import com.ali.entity.Cou;
import com.ali.service.CouService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Cou)表控制层
 *
 * @author makejava
 * @since 2020-11-18 11:09:57
 */
@RestController


public class CouController {
    /**
     * 服务对象
     */
    @Resource
    private CouService couService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cou selectOne(Integer id) {
        return this.couService.queryById(id);
    }


}