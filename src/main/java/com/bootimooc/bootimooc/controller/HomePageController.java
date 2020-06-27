package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.HomePage;
import com.bootimooc.bootimooc.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allhomepage")
    @ResponseBody
    public List<HomePage> selectAllHomePage(){
        List<HomePage> homePages = homePageService.selectAllHomePage();
        System.out.println(homePages+"11111");
        return homePages;
    }
}
