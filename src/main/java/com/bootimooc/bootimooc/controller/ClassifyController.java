package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.Classify;
import com.bootimooc.bootimooc.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/selectClassifyAllOrByDirectionid")
    @ResponseBody
    public List<Classify> selectClassifyAllOrByDirectionid(String describee){
        return classifyService.selectClassifyAllOrByDirectionid(describee);
    }
}
