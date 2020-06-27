package com.bootimooc.bootimooc.service;

import com.bootimooc.bootimooc.entity.Users;

import java.util.List;

public interface UsersService {

    /*查询所有的*/
    List<Users> selectUsersByAll();

    /*登录*/
    boolean selectUsersByNamePwd(String uname,String pwd);

    /*注册用户*/
    boolean insertUsers(Users users);

    /*查询是否有用户*/
    boolean selectUsersByName(String uname);



}
