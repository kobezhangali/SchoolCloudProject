package com.ali.service;

import com.ali.entity.Student;
import com.ali.entity.StudentInfo;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2020-11-17 23:32:28
 */
public interface StudentService {

    Student queryByUid(Integer uid);
    StudentInfo getStudentInfo(int uid);
    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Student queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

}