/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Course;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author admin
 */
public class CourseService extends AbstractDao<Course> {

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
