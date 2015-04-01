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
public class LoginAction extends AbstractAction {
    private Employee employee;
    private EmployeeService employeeService;

    public LoginAction() {
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService service) {
        this.employeeService = service;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    // action methods
    @Override
    public String execute(){
        return "login";
    }

    public String check(){
        Employee  e =  this.getEmployeeService().checkLogin(employee.getInternalEmail(), employee.getPassword());
        if (e != null) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
