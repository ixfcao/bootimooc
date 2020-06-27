package com.bootimooc.bootimooc.controller;


import com.bootimooc.bootimooc.entity.Direction;
import com.bootimooc.bootimooc.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DirectionController {

    @Autowired
    private DirectionService directionService;

    @CrossOrigin("*")
    @RequestMapping("/allDirections")
    @ResponseBody
    public List<Direction> selectDirectionAll(){

        return directionService.selectDirectionAll();
    }
}
