package com.ali.controller;

import com.ali.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private  RestTemplate restTemplate;
@GetMapping("getUserByUid")
    public String getUser(int uid){
    return restTemplate.getForObject("http://userProvider/getUser?uid="+uid,String.class);
}
@PostMapping("login")
    public String login(User user){
    System.out.println("00000000000000000000000");
    String username=user.getUsername();
    String password=user.getPassword();
    Map<String,String> map=new HashMap<>();
    map.put("username",username);
    map.put("password",password);
    return restTemplate.postForObject("http://userProvider/getOneByUP",map,String.class);
}

    public String abc(String username, String password){
        return "登陆失败";
    }


@GetMapping("updatePassword")
    public String updatePassword(@RequestParam String pass,
                                 @RequestParam String newpass,
                                 @RequestParam String username){
    System.out.println(pass);
    System.out.println(newpass);
    System.out.println(username);
    Map<String,String> map=new HashMap<>();
    map.put("newPass",newpass);
    map.put("Pass",pass);
    map.put("username",username);
    return restTemplate.postForObject("http://userProvider/updatePass",map,String.class);
}

@PostMapping("update")
    public String update(User user){
        return restTemplate.postForObject("http://userProvider/updateUser",user,String.class);
}
@GetMapping("getOnlineInfo")
    public String getOnlineInfo(int uid){
    return restTemplate.getForObject("http://userProvider/getOnlineInfo?uid="+uid,String.class);
}
}
