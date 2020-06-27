package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.Course;
import com.bootimooc.bootimooc.service.ScreenCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScreenCourseController {

    @Autowired
    private ScreenCourseService screenCourseService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/ScreenAllCourse")
    @ResponseBody
    public List<Course> ScreenAllCourse(String describee, String classifyName, String levelName, String courseName){
        return screenCourseService.ScreenAllCourse(describee, classifyName, levelName, courseName);
    }
}
