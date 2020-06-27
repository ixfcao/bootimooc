package com.bootimooc.bootimooc.service;

import com.bootimooc.bootimooc.entity.Course;

import java.util.List;

public interface ScreenCourseService {

    // 根据条件筛选课程   搜索课程
    List<Course> ScreenAllCourse(String describee,String classifyName,String levelName,String courseName);
}
