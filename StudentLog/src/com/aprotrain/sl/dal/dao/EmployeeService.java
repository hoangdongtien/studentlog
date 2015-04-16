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
        Session session = this.getSession();

        Query query = session.createQuery("From Employee");
        List<Employee> listEmp = query.list();

        session.close();
        return listEmp;
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

        session.close();

        return e;
    }

    public List<Employee> search(String FullName) {
        Session session = this.getSession();

        Query query = session.createQuery("FROM Employee WHERE FullName like '%' + :FName + '%'");
        query.setParameter("FName", FullName);

        List<Employee> list = query.list();
        session.close();

        return list;
    }

}
