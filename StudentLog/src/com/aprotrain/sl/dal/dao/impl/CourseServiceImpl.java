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
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CourseServiceImpl extends AbstractDao<Course> implements CourseService  {

    @Override
    public List<Course> listAll() {
        Session session = this.getSession();

        Query query = session.createQuery("From Course");
        List<Course> listCourse = query.list();

        session.close();
        return listCourse;
    }

   
    public List<Course> search(String CourseCode) {
        Session session = this.getSession();

        Query query = session.createQuery("FROM Course WHERE CourseCode like '%' + :CC + '%'");
        query.setParameter("CC", CourseCode);

        List<Course> list = query.list();
        session.close();

        return list;
    }
}
