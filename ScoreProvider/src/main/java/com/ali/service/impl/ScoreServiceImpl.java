package com.ali.service.impl;

import com.ali.dao.ScoreDao;
import com.ali.entity.CouAndSoc;
import com.ali.entity.Score;
import com.ali.entity.ScoreInfo;
import com.ali.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2020-11-12 21:19:12
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;

    @Override
    public int addCourse(Score score) {
        return scoreDao.addCourse(score);
    }

    @Override
    public List<ScoreInfo> getScoreInfo(int uid) {
        return scoreDao.getScoreInfo(uid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param scoreid 主键
     * @return 实例对象
     */
    @Override
    public Score queryById(Integer scoreid) {
        return this.scoreDao.queryById(scoreid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Score> queryAllByLimit(int offset, int limit) {
        return this.scoreDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score insert(Score score) {
        this.scoreDao.insert(score);
        return score;
    }

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score update(Score score) {
        this.scoreDao.update(score);
        return this.queryById(score.getScoreid());
    }

    /**
     * 通过主键删除数据
     *
     * @param scoreid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer scoreid) {
        return this.scoreDao.deleteById(scoreid) > 0;
    }

    @Override
    public List<CouAndSoc> getScoreAndCou(int uid) {
        return scoreDao.getScoreAndCou(uid);
    }
}