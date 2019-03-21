package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> selectAll();
    List<Course> selectAll1();

    Course getOne(long courseId);
    void delete(long courseId);
    void insert(Course course);
    void update(Course course);
}
