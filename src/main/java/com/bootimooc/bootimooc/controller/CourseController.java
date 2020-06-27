package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.Course;
import com.bootimooc.bootimooc.entity.CourseExample;
import com.bootimooc.bootimooc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allcourse")
    @ResponseBody
    public List<Course> selectAllCourse(){

        return courseService.selectAllCourse();
    }

    // 根据id查询课程
    @CrossOrigin(origins = "*")
    @RequestMapping("/selectCourseById")
    @ResponseBody
    public Course selectCourseById(Integer id){
        return courseService.selectCourseById(id);
    }

    /*包括章节的课程*/
    @CrossOrigin(origins = "*")
    @RequestMapping("/selectCourseChapterById")
    @ResponseBody
    public Course selectCourseChapterById(Integer id){
        return courseService.selectCourseChapterById(id);
    }

}
