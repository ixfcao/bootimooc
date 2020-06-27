package com.bootimooc.bootimooc.service;


import com.bootimooc.bootimooc.entity.HomePage;

import java.util.List;

public interface HomePageService {

    // 查询所有的首页信息
    List<HomePage> selectAllHomePage();
}
