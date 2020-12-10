package com.ali.service;

import com.ali.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-11-16 15:37:13
 */
public interface UserService {

    OnlineInfo  getOnlineInfo(int uid);

    //    查询学生学习成绩

    List<ScoreInfo> getScoreInfo(int uid);

    User queryOneByUP(User user);
    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    User queryById(Integer uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);
    int updatePass(User user);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

    User queryOneByPass(String password,String username);

//    List<Roles> getRolesByUsername(String user);
//
//    List<Permissions> getPermissionsByUsername(String user);
//
//    User login(@Param("username") String username, @Param("password") String password);
//
//    List<PermsRole> getPermsRole(int uid);

}