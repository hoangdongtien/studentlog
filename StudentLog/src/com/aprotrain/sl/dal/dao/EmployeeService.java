/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class EmployeeService extends AbstractDao<Employee> {

    public EmployeeService() {
    }

    @Override
    public List<Employee> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee update(Employee a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee delete(Employee a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee saveOrUpdate(Employee a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employee checkLogin(String internalEmail, String password) {
        Session session = this.getSession();

        Query query = session.createQuery("FROM Employee WHERE internalEmail=:mail AND password=:password");
        query.setString("mail", internalEmail);
        query.setString("password", password);
        query.setMaxResults(1);

        List<Employee> list = query.list();
        Employee e = null;
        if (!list.isEmpty()) {
            e = list.get(0);
        }
        return e;
    }

}
