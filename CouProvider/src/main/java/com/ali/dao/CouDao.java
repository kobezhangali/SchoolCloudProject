package com.ali.dao;

import com.ali.entity.Cou;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Cou)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-18 11:09:56
 */
@Mapper
public interface CouDao {

    /**
     * 通过ID查询单条数据
     *
     * @param couid 主键
     * @return 实例对象
     */
    Cou queryById(Integer couid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cou> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cou 实例对象
     * @return 对象列表
     */
    List<Cou> queryAll(Cou cou);

    /**
     * 新增数据
     *
     * @param cou 实例对象
     * @return 影响行数
     */
    int insert(Cou cou);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Cou> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Cou> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Cou> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Cou> entities);

    /**
     * 修改数据
     *
     * @param cou 实例对象
     * @return 影响行数
     */
    int update(Cou cou);

    /**
     * 通过主键删除数据
     *
     * @param couid 主键
     * @return 影响行数
     */
    int deleteById(Integer couid);

}