package com.bootimooc.bootimooc.service;

import com.bootimooc.bootimooc.entity.Course;

import java.util.List;

public interface CourseService {

    // 获取全部的课程
    List<Course> selectAllCourse();

    // 根据商品id查询 到详情页
    Course selectCourseById(Integer id);

    // 根据商品id查询course 包含chapter 到详情页
    Course selectCourseChapterById(Integer id);
}
