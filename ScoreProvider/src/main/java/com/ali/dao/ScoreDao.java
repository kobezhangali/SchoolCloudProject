package com.ali.dao;


import com.ali.entity.CouAndSoc;
import com.ali.entity.Score;
import com.ali.entity.ScoreInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Score)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-12 21:19:12
 */
@Mapper
public interface ScoreDao {

    int addCourse(Score score);
    List<ScoreInfo> getScoreInfo(int uid);

    /**
     * 通过ID查询单条数据
     *
     * @param scoreid 主键
     * @return 实例对象
     */
    Score queryById(Integer scoreid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Score> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param score 实例对象
     * @return 对象列表
     */
    List<Score> queryAll(Score score);

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 影响行数
     */
    int insert(Score score);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Score> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Score> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Score> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Score> entities);

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 影响行数
     */
    int update(Score score);

    /**
     * 通过主键删除数据
     *
     * @param scoreid 主键
     * @return 影响行数
     */
    int deleteById(Integer scoreid);

    List<CouAndSoc> getScoreAndCou(int uid);
}