package com.ali.service;

import com.ali.entity.Cou;

import java.util.List;

/**
 * (Cou)表服务接口
 *
 * @author makejava
 * @since 2020-11-18 11:09:56
 */
public interface CouService {

    /**
     * 通过ID查询单条数据
     *
     * @param couid 主键
     * @return 实例对象
     */
    Cou queryById(Integer couid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cou> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cou 实例对象
     * @return 实例对象
     */
    Cou insert(Cou cou);

    /**
     * 修改数据
     *
     * @param cou 实例对象
     * @return 实例对象
     */
    Cou update(Cou cou);

    /**
     * 通过主键删除数据
     *
     * @param couid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer couid);

}