/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.common.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tien Hoang D
 */
public abstract class AbstractDao<T> implements BaseDao<T>{
    private static final SessionFactory sessionFactory;
    private  Session session;
    
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
    
    public static void closeSessionFactory(){
        if (sessionFactory != null && !sessionFactory.isClosed()){
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
    
    
}
