package com.ali.controller;

import com.ali.entity.*;

import com.ali.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.Map;


/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-11-16 15:37:13
 */
@RestController

public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;
    @PostMapping("getOneByUP")
    public User getOneByUP(@RequestBody Map map){
        String username=(String) map.get("username");
        String password=(String) map.get("password");
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        return this.userService.queryOneByUP(user);
    }
    @GetMapping("getUser")
    public User getUserByUid(int uid){
        return this.userService.queryById(uid);
    }
    @PostMapping("updatePass")
    public boolean updatePass(@RequestBody Map map){
        String newPass=(String) map.get("newPass");
        String Pass=(String) map.get("Pass");
        String username=(String) map.get("username");
        User user=new User();
        user.setPassword(newPass);
        user.setUsername(username);
         User u=this.userService.queryOneByPass(Pass,username);
        if(u!=null){
            this.userService.updatePass(user);
            return true;
        }else {
            return false;
        }

    }
    @PostMapping("updateUser")
    public User updateUser(@RequestBody User user){
        System.out.println("user");
        return this.userService.update(user);
    }


//
//    @GetMapping("getScoreInfo")
//    public List<ScoreInfo> getScoreInfo(int uid){
//
//        return this.userService.getScoreInfo(uid);
//    }
    @GetMapping("getOnlineInfo")
    public OnlineInfo getOnlineInfo(int uid){
        return this.userService.getOnlineInfo(uid);
    }

//    @GetMapping("getPermsRole")
//    public List<PermsRole> getPermsRole(int uid){
//        return this.userService.getPermsRole(uid);
//    }
}