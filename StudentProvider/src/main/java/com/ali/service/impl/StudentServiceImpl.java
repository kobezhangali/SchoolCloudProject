package com.ali.service.impl;

import com.ali.dao.StudentDao;
import com.ali.entity.Student;
import com.ali.entity.StudentInfo;
import com.ali.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2020-11-17 23:32:28
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student queryByUid(Integer uid) {
        return studentDao.queryByUid(uid);
    }

    @Override
    public StudentInfo getStudentInfo(int uid) {
        return studentDao.getStudentInfo(uid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer sid) {
        return this.studentDao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return this.studentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.studentDao.deleteById(sid) > 0;
    }
}