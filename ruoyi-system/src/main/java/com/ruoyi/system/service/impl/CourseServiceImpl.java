package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.mapper.CourseMapper;
import com.ruoyi.system.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> selectCourseList(Course course) {
        return courseMapper.selectCourseList(course);
    }

    @Override
    public Course selectCourseById(Long courseId) {
        return courseMapper.selectCourseById(courseId);
    }

    @Override
    public int insertCourse(Course course) {
        return courseMapper.insertCourse(course);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateCourse(course);
    }

    @Override
    public int deleteCourseByIds(Long[] courseIds) {
        return courseMapper.deleteCourseByIds(courseIds);
    }
}
