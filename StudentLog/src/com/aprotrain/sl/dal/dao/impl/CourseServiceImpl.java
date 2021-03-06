/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao.impl;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.dao.CourseService;
import com.aprotrain.sl.dal.entity.Course;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author admin
 */
public class CourseServiceImpl extends AbstractDao<Course> implements CourseService {

    public CourseServiceImpl() {
        super();
        this.setEntityType(Course.class);
    }

    @Override
    public List<Course> search(Course course) {
        Session session = this.getSession();

        Criteria cr = session.createCriteria("FROM Course");

        cr.add(Restrictions.ilike("courseCode", course.getCourseCode()));

        List<Course> list = cr.list();
        session.close();

        return list;
    }
}
