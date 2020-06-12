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

    @CrossOrigin("*")
    @ResponseBody
    @RequestMapping("/login")
    public String Login(String uname , String pwd){



        boolean b = usersService.selectUsersByNamePwd(uname,pwd);
//        return  usersService.selectUsersByAll();

        if (b) {
            return "登录成功";
        }else {
            return "登录失败";
        }
//        return "1";
    }
}
