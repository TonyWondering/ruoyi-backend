package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Course;

public interface ICourseService {
    List<Course> selectCourseList(Course course);
    Course selectCourseById(Long courseId);
    int insertCourse(Course course);
    int updateCourse(Course course);
    int deleteCourseByIds(Long[] courseIds);
}
