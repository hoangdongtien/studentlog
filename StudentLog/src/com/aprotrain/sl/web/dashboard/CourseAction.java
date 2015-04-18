/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.web.dashboard;

import com.aprotrain.sl.dal.dao.CourseService;
import com.aprotrain.sl.dal.entity.Course;
import com.aprotrain.sl.web.common.AbstractAction;
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
        this.courseList = this.getCourseService().listAll();      
        return "list";
    }
    
    public String edit(){
        course = new Course(2, "tesst", 1990, "remark", Byte.MIN_VALUE, null);
        return "input";
    }
        
    public String add(){
        return "input";
    }
    
    public String save(){
        return "changefinish";
    }
}
