package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.Estimate;
import com.bootimooc.bootimooc.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EstimateController  {

    @Autowired
    private EstimateService estimateService;

    @CrossOrigin("*")
    @RequestMapping("/selectEstimateByCourseName")
    @ResponseBody
    List<Estimate> selectEstimateByCourseName(String courseName){

        return estimateService.selectEstimateByCourseName(courseName);
    }
}
