package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> selectAll();

    List<Course> selectAll1();

    Course getOne(Long courseId);

    void delete(Long courseId);

    void insert(Course course);

    void update(Course course);
}
