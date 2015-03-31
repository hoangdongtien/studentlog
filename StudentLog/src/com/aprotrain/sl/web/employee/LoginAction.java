/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.web.employee;

import com.aprotrain.sl.web.common.AbstractAction;
import com.aprotrain.sl.dal.dao.EmployeeService;
import com.aprotrain.sl.dal.entity.Employee;

/**
 *
 * @author Tien Hoang D
 */
public class LoginAction extends AbstractAction<Employee> {
    private Employee model;
    private EmployeeService empServ;

    public LoginAction() {
        model = new Employee();
    }



    public EmployeeService getEmpServ() {
        return empServ;
    }

    public void setEmpServ(EmployeeService service) {
        this.empServ = service;
    }


    @Override
    public String execute(){
        return "login";
    }

    public String check(){
        Employee  e =  this.getEmpServ().checkLogin(model.getInternalEmail(), model.getPassword());
        if (e != null) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public Employee getModel() {
        return this.model;
    }


}
