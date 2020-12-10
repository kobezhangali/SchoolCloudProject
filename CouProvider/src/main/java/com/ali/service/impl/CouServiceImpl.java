package com.ali.service.impl;

import com.ali.dao.CouDao;
import com.ali.entity.Cou;
import com.ali.service.CouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Cou)表服务实现类
 *
 * @author makejava
 * @since 2020-11-18 11:09:56
 */
@Service("couService")
public class CouServiceImpl implements CouService {
    @Autowired
    private CouDao couDao;

    /**
     * 通过ID查询单条数据
     *
     * @param couid 主键
     * @return 实例对象
     */
    @Override
    public Cou queryById(Integer couid) {
        return this.couDao.queryById(couid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Cou> queryAllByLimit(int offset, int limit) {
        return this.couDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cou 实例对象
     * @return 实例对象
     */
    @Override
    public Cou insert(Cou cou) {
        this.couDao.insert(cou);
        return cou;
    }

    /**
     * 修改数据
     *
     * @param cou 实例对象
     * @return 实例对象
     */
    @Override
    public Cou update(Cou cou) {
        this.couDao.update(cou);
        return this.queryById(cou.getCouid());
    }

    /**
     * 通过主键删除数据
     *
     * @param couid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer couid) {
        return this.couDao.deleteById(couid) > 0;
    }
}