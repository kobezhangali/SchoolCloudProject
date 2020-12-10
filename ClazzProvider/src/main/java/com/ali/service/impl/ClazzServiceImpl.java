package com.ali.service.impl;

import com.ali.dao.ClazzDao;
import com.ali.entity.ClassInfo;
import com.ali.entity.Clazz;
import com.ali.service.ClazzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Clazz)表服务实现类
 *
 * @author makejava
 * @since 2020-11-12 21:18:19
 */
@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {
    @Resource
    private ClazzDao clazzDao;

    @Override
    public List<ClassInfo> getClassInfo(int uid) {
        return clazzDao.getClassInfo(uid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Clazz queryById(Integer cid) {
        return this.clazzDao.queryById(cid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Clazz> queryAllByLimit(int offset, int limit) {
        return this.clazzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public Clazz insert(Clazz clazz) {
        this.clazzDao.insert(clazz);
        return clazz;
    }

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public Clazz update(Clazz clazz) {
        this.clazzDao.update(clazz);
        return this.queryById(clazz.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.clazzDao.deleteById(cid) > 0;
    }
}