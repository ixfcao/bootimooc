package com.bootimooc.bootimooc.service;

import com.bootimooc.bootimooc.entity.Users;

import java.util.List;

public interface UsersService {

    /*查询所有的*/
    List<Users> selectUsersByAll();

    /*登录*/
//    boolean selectUsersByNamePwd (String uname, String pwd);
    boolean selectUsersByNamePwd(String uname,String pwd);
}
