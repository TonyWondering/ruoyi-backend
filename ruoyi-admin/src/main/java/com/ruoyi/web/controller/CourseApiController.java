package com.ruoyi.web.controller;

import java.util.List;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseApiController extends BaseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/list")
    public AjaxResult list(Course course) {
        List<Course> list = courseService.selectCourseList(course);
        return success(list);
    }

    @GetMapping("/{courseId}")
    public AjaxResult getInfo(@PathVariable Long courseId) {
        return success(courseService.selectCourseById(courseId));
    }
}
