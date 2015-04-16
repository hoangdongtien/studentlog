/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Course;
import com.aprotrain.sl.dal.entity.Employee;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

    @Override
    public Employee add(Employee e) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.save(e);
            tran.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return e;
    }

    @Override
    public Employee update(Employee emp) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.update(String.valueOf(emp.getEmployeeId()), emp);
            tran.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return emp;
    }

    @Override
    public Employee delete(Employee emp) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.delete(emp);

            tran.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return emp;
    }

    //saveOrUpdate ko chay dc khi id la new ko tao moi dc @@ vi khi la id new no nhan luong ID nen chet cot tu tang identity
    @Override
    public Employee saveOrUpdate(Employee emp) {
        Transaction tran = null;
        Session session = this.getSession();

        try {
            tran = session.beginTransaction();
            session.saveOrUpdate(emp);
            tran.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tran.rollback();
        }

        session.close();
        return emp;
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

    public static void main(String[] args) {
        EmployeeService obj = new EmployeeService();
        List<Employee> listC = obj.search("v");
        System.out.println(listC.size());
    }
}
