package com.ali.dao;


import com.ali.entity.Course;
import com.ali.entity.CourseAll;
import com.ali.entity.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Course)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-17 23:32:27
 */
@Mapper
public interface CourseDao {

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
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Course> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param course 实例对象
     * @return 对象列表
     */
    List<Course> queryAll(Course course);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int insert(Course course);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Course> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Course> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Course> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Course> entities);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 影响行数
     */
    int deleteById(Integer courseid);

}