package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.Level;
import com.bootimooc.bootimooc.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LevelController {

    @Autowired
    private LevelService levelService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allLevel")
    @ResponseBody
    public List<Level> selectAllLevel(){
        return levelService.selectAllLevel();
    }
}
