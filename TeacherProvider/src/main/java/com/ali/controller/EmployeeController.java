package com.ali.controller;

import com.ali.entity.Employee;
import com.ali.entity.Teacher;
import com.ali.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2020-11-12 21:18:42
 */
@RestController

public class EmployeeController {
    /**
     * 服务对象
     */
    @Autowired
    private EmployeeService employeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employee selectOne(@RequestParam Integer id) {
        return this.employeeService.queryById(id);
    }

    @GetMapping("getAllTeacher")
    public List<Teacher> getAllTeacher(){
        return this.employeeService.getAllTeacher();
    }
}