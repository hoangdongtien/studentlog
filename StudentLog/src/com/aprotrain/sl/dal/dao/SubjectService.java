/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Course;
import com.aprotrain.sl.dal.entity.Subject;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class SubjectService extends AbstractDao<Subject> {

    @Override
    public List<Subject> listAll() {
        Session session = openSession();
        Query query = session.createQuery(" FROM Subject s JOIN s.course ");
        //http://levelup.lishman.com/hibernate/hql/joins.php     
        List<Subject> listSub = query.list();
        session.close();

        return listSub;
    }  
}
