/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao.impl;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Student;

/**
 *
 * @author admin
 */
public class StudentServiceImpl extends AbstractDao<Student> {

    public StudentServiceImpl() {
        super();
        this.setEntityType(Student.class);
    }

}
