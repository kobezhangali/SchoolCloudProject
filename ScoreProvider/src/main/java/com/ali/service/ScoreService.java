package com.ali.service;

import com.ali.entity.CouAndSoc;
import com.ali.entity.Score;
import com.ali.entity.ScoreInfo;

import java.util.List;

/**
 * (Score)表服务接口
 *
 * @author makejava
 * @since 2020-11-12 21:19:12
 */
public interface ScoreService {


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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Score> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score insert(Score score);

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score update(Score score);

    /**
     * 通过主键删除数据
     *
     * @param scoreid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer scoreid);

    List<CouAndSoc> getScoreAndCou(int uid);

}