/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao.impl;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.entity.Subject;

/**
 *
 * @author admin
 */
public class SubjectServiceImpl extends AbstractDao<Subject> {

    public SubjectServiceImpl() {
        super();
        this.setEntityType(Subject.class);
    }


}
