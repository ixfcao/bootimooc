package com.bootimooc.bootimooc.controller;


import com.bootimooc.bootimooc.entity.Users;
import com.bootimooc.bootimooc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/imooc")
public class UsersController {

    @Autowired
    private UsersService usersService;

    // 登录用户
    @CrossOrigin("*")
    @ResponseBody
    @RequestMapping("/login")
    public String Login(String uname , String pwd){

        boolean b = usersService.selectUsersByNamePwd(uname,pwd);

        if (b) {
            return uname;
        }else {
            return "登录失败";
        }

    }

    // 注册用户
    @CrossOrigin("*")
    @ResponseBody
    @RequestMapping("/register")
    public  String Register(String uname, String pwd){

        if(uname != "" && pwd != ""){
            boolean b1 = usersService.selectUsersByName(uname);
            if (b1){
                return "用户名已存在";
            }else {
                Users users = new Users();
                users.setNickname(uname);
                users.setPassword(pwd);
                boolean b2 = usersService.insertUsers(users);
                if (b2) {
                    return "注册成功";
                }else {
                    return "注册失败";
                }
            }
        }else {
            return "用户名和密码不能为空";
        }

    }


}
