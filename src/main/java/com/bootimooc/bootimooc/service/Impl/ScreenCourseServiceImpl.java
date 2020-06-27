package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Course;
import com.bootimooc.bootimooc.mapper.ScreenCourseMapper;
import com.bootimooc.bootimooc.service.ScreenCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScreenCourseServiceImpl implements ScreenCourseService {

    @Autowired
    private ScreenCourseMapper screenCourseMapper;

    @Override
    public List<Course> ScreenAllCourse(String describee, String classifyName, String levelName, String courseName) {
        return screenCourseMapper.ScreenAllCourse(describee, classifyName, levelName, courseName);
    }
}
