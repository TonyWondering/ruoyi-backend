package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Course;

public interface CourseMapper {
    List<Course> selectCourseList(Course course);
    Course selectCourseById(Long courseId);
    int insertCourse(Course course);
    int updateCourse(Course course);
    int deleteCourseById(Long courseId);
    int deleteCourseByIds(Long[] courseIds);
}
