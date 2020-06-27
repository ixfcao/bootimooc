package com.bootimooc.bootimooc.mapper;

import com.bootimooc.bootimooc.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScreenCourseMapper {

    List<Course> ScreenAllCourse(String describee,String classifyName,String levelName,String courseName);
}
