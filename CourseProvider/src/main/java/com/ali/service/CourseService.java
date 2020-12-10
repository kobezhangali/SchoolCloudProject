package com.ali.service;

import com.ali.entity.Course;
import com.ali.entity.CourseAll;
import com.ali.entity.CourseInfo;

import java.util.List;

/**
 * (Course)表服务接口
 *
 * @author makejava
 * @since 2020-11-17 23:32:27
 */
public interface CourseService {

    CourseInfo getCourseByUC(int uid,int couid);

    List<CourseAll> getCourseAll();

    List<CourseInfo> getCourseInfo(int uid);
    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    Course queryById(Integer courseid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Course> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course insert(Course course);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer courseid);

}