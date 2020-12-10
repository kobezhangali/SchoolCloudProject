package com.ali.service.impl;

import com.ali.dao.UserDao;

import com.ali.entity.*;
import com.ali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-11-16 15:37:13
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public OnlineInfo getOnlineInfo(int uid) {
        return userDao.getOnlineInfo(uid);
    }

    @Override
    public List<ScoreInfo> getScoreInfo(int uid) {
        return userDao.getScoreInfo(uid);
    }



    @Override
    public User queryOneByUP(User user) {
        return userDao.queryOneByUP(user);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer uid) {
        return this.userDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }



    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getUid());
    }

    @Override
    public int updatePass(User user) {
        return this.userDao.updatePass(user);
    }


    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.userDao.deleteById(uid) > 0;
    }

    @Override
    public User queryOneByPass(String password,String username) {
        return this.userDao.queryOneByPass(password,username);
    }


//    @Override
//    public List<Roles> getRolesByUsername(String user) {
//        return userDao.getRolesByUsername(user);
//    }
//
//    @Override
//    public List<Permissions> getPermissionsByUsername(String user) {
//        return userDao.getPermissionsByUsername(user);
//    }
//
//    @Override
//    public User login(String username, String password) {
//        return userDao.login(username, password);
//    }
//
//    @Override
//    public List<PermsRole> getPermsRole(int uid) {
//        return userDao.getPermsRole(uid);
//    }
}