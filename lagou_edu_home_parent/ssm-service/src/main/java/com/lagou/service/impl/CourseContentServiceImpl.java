package com.lagou.service.impl;

import com.lagou.dao.CourseContentMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseContentServiceImpl implements CourseContentService {

    @Autowired
    private CourseContentMapper courseContentMapper;


    @Override
    public List<CourseSection> findSectionAndLessonByCourseId(Integer courseId) {
        List<CourseSection> list = courseContentMapper.findSectionAndLessonByCourseId(courseId);
        return list;
    }

    @Override
    public Course findCourseByCourseId(Integer courseId) {
        Course course = courseContentMapper.findCourseByCourseId(courseId);
        return course;
    }

    @Override
    public void saveSection(CourseSection section) {
        //1.补全信息
        Date date = new Date();
        section.setCreateTime(date);
        section.setUpdateTime(date);

        //2.调用mapper
        courseContentMapper.saveSection(section);
    }

    @Override
    public void updateSection(CourseSection section) {
        //1.补全信息
        Date date = new Date();
        section.setUpdateTime(date);

        //2.调用mapper
        courseContentMapper.updateSection(section);
    }

    @Override
    public void updateSectionStatus(int id, int status) {

        //封装数据
        CourseSection courseSection = new CourseSection();
        courseSection.setStatus(status);
        courseSection.setUpdateTime(new Date());
        courseSection.setId(id);

        //调用mapper
        courseContentMapper.updateSectionStatus(courseSection);
    }

    @Override
    public void saveLesson(CourseLesson lesson) {

        //补全信息
        Date date = new Date();
        lesson.setCreateTime(date);
        lesson.setUpdateTime(date);

        //调用mapper
        courseContentMapper.saveLesson(lesson);
    }
}
