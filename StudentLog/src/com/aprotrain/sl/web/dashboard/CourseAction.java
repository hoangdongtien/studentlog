/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.web.dashboard;

import com.aprotrain.sl.dal.dao.CourseService;
import com.aprotrain.sl.dal.entity.Course;
import com.aprotrain.sl.web.common.AbstractAction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Dong Tien
 */
public class CourseAction extends AbstractAction {
    private CourseService courseService;

   
    private Course course;
    private List<Course> courseList;

    public CourseAction() {
        super();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    
     public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
    
//    action methods
    public String list(){       
        this.courseList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Course c = new Course();
            c.setCourseCode("test" + i);
            this.courseList.add(c);
        }
        
        return "list";
    }
}
