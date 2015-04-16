/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Course;
import com.aprotrain.sl.dal.entity.Employee;
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

    @Override
    public Course add(Course a) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.save(a);
            tran.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }
        session.close();
        return a;
    }

    @Override
    public Course update(Course cou) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.update(String.valueOf(cou.getCourseId()), cou);
            tran.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return cou;
    }

    @Override
    public Course delete(Course cou) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.delete(cou);

            tran.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return cou;
    }

    @Override
    public Course saveOrUpdate(Course cou) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.saveOrUpdate(cou);
            tran.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return cou;
    }

    public List<Course> search(String CourseCode) {
        Session session = this.getSession();

        Query query = session.createQuery("FROM Course WHERE CourseCode like '%' + :CC + '%'");
        query.setParameter("CC", CourseCode);

        List<Course> list = query.list();
        session.close();

        return list;
    }

    public static void main(String[] args) {
        CourseService obj = new CourseService();
        List<Course> listC = obj.search("0");
        System.out.println(listC.size());
    }
}
