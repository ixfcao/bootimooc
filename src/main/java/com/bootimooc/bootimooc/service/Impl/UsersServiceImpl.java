package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Users;
import com.bootimooc.bootimooc.entity.UsersExample;
import com.bootimooc.bootimooc.mapper.UsersMapper;
import com.bootimooc.bootimooc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

//    @Autowired
//    private  UsersExample usersExample ;

    @Autowired
    private UsersMapper usersMapper ;

    /*查询所有用户*/
    @Override
    public List<Users> selectUsersByAll() {
        return usersMapper.selectByExample(new UsersExample());
    }

    @Override
    public boolean selectUsersByNamePwd(String uname,String pwd) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andNicknameEqualTo(uname).andPasswordEqualTo(pwd);


        List<Users> users = usersMapper.selectByExample(usersExample);
        return users.size() > 0 ;
    }

    @Override
    public boolean insertUsers(Users users) {
        return usersMapper.insert(users)>0;
    }

    @Override
    public boolean selectUsersByName(String uname) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andNicknameEqualTo(uname);
        List<Users> users = usersMapper.selectByExample(usersExample);
        return users.size() > 0;
    }
}
