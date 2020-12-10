package com.ali.dao;

import com.ali.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-16 15:37:13
 */
@Mapper
public interface UserDao {
    OnlineInfo  getOnlineInfo(int uid);
    //OnlineInfo getOnlineInfo(int uid);
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
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    int updatePass(User user);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Integer uid);
    User queryOneByPass(String password,String username);

//    List<Roles> getRolesByUsername(String user);
//
//    List<Permissions> getPermissionsByUsername(String user);
//
//    User login(String username,String password);
//
//    List<PermsRole> getPermsRole(int uid);


}