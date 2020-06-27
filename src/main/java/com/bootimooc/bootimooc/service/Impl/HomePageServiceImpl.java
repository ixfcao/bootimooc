package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.HomePage;
import com.bootimooc.bootimooc.mapper.HomePageMapper;
import com.bootimooc.bootimooc.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    private HomePageMapper homePageMapper ;

    @Override
    public List<HomePage> selectAllHomePage() {
        return homePageMapper.selectAllHomePage();
    }
}
