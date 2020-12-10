package com.ali.service.impl;


import com.ali.dao.CourseDao;
import com.ali.entity.Course;
import com.ali.entity.CourseAll;
import com.ali.entity.CourseInfo;
import com.ali.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2020-11-17 23:32:27
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    @Override
    public CourseInfo getCourseByUC(int uid, int couid) {
        return courseDao.getCourseByUC(uid,couid);
    }

    @Override
    public List<CourseAll> getCourseAll() {
        return courseDao.getCourseAll();
    }

    @Override
    public List<CourseInfo> getCourseInfo(int uid) {
        return courseDao.getCourseInfo(uid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    @Override
    public Course queryById(Integer courseid) {
        return this.courseDao.queryById(courseid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Course> queryAllByLimit(int offset, int limit) {
        return this.courseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course insert(Course course) {
        this.courseDao.insert(course);
        return course;
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course update(Course course) {
        this.courseDao.update(course);
        return this.queryById(course.getCourseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer courseid) {
        return this.courseDao.deleteById(courseid) > 0;
    }
}