package com.ali.service;

import com.ali.entity.ClassInfo;
import com.ali.entity.Clazz;

import java.util.List;

/**
 * (Clazz)表服务接口
 *
 * @author makejava
 * @since 2020-11-12 21:18:19
 */
public interface ClazzService {

    List<ClassInfo> getClassInfo(int uid);

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Clazz queryById(Integer cid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Clazz> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    Clazz insert(Clazz clazz);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    Clazz update(Clazz clazz);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

}