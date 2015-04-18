/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.common;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tien Hoang D
 * @param <T>
 */
public abstract class AbstractDao<T> implements BaseDao<T> {
    private static final SessionFactory sessionFactory;
    private Session session;
    private Class<T> type;

    public Class<T> getEntityType() {
        return type;
    }

    public void setEntityType(Class<T> type) {
        this.type = type;
    }

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml)
            // config file.
            Configuration config = new Configuration().configure("hibernate.cfg.xml");

            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
            StandardServiceRegistry reg = builder.applySettings(config.getProperties()).build();

            sessionFactory = config.buildSessionFactory(reg);
        } catch (Throwable ex) {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void closeSessionFactory() {
        if (sessionFactory != null && !sessionFactory.isClosed()) {
            sessionFactory.close();
        }
    }

    // Common Methods
    public Session getSession() {
        if (session == null || !session.isOpen()) {
            session = openSession();
        }
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Session openSession() {
        return sessionFactory.openSession();
    }

    @Override
    public T add(T a) {
        Session s = this.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.save(a);
            tx.commit();

        } catch (Exception ex) {
            tx.rollback();
            throw ex;
        }
        s.close();
        return a;
    }

    @Override
    public T saveOrUpdate(T a) {
        Session s = this.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.saveOrUpdate(a);
            tx.commit();

        } catch (Exception ex) {
            tx.rollback();
            throw ex;
        }
        s.close();
        return a;
    }

    @Override
    public T delete(T a){
        Session s = this.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.delete(a);
            tx.commit();

        } catch (Exception ex) {
            tx.rollback();
            throw ex;
        }
        s.close();
        return a;
    }

    @Override
    public T update(T a){
        Session s = this.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.saveOrUpdate(a);
            tx.commit();

        } catch (Exception ex) {
            tx.rollback();
            throw ex;
        }
        s.close();
        return a;
    }

    @Override
    public List<T> listAll(){
        Session s = this.getSession();
        Criteria criteria = s.createCriteria(this.getEntityType());

        List<T> list = criteria.list();
        s.close();
        return list;
    }

}
