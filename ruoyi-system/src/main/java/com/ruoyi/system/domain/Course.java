package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

public class Course extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Excel(name = "课程ID")
    private Long courseId;

    @Excel(name = "课程名称")
    private String courseName;

    @Excel(name = "分类")
    private String category;

    @Excel(name = "级别")
    private String level;

    @Excel(name = "课时时长")
    private Integer hours;

    @Excel(name = "封面图")
    private String coverImg;

    @Excel(name = "视频链接")
    private String videoUrl;

    @Excel(name = "排序")
    private Integer sortOrder;

    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public Integer getHours() { return hours; }
    public void setHours(Integer hours) { this.hours = hours; }
    public String getCoverImg() { return coverImg; }
    public void setCoverImg(String coverImg) { this.coverImg = coverImg; }
    public String getVideoUrl() { return videoUrl; }
    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl; }
    public Integer getSortOrder() { return sortOrder; }
    public void setSortOrder(Integer sortOrder) { this.sortOrder = sortOrder; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
