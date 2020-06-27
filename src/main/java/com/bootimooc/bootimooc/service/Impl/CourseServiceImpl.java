package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Course;
import com.bootimooc.bootimooc.entity.CourseExample;
import com.bootimooc.bootimooc.mapper.CourseMapper;
import com.bootimooc.bootimooc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> selectAllCourse() {
        return courseMapper.selectByExample(new CourseExample());
    }

    @Override
    public Course selectCourseById(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public Course selectCourseChapterById(Integer id) {
        return courseMapper.selectCourseChapterById(id);
    }


}
