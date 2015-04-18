/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao.impl;

import com.aprotrain.sl.dal.common.AbstractDao;
import com.aprotrain.sl.dal.dao.ClassUnitService;
import com.aprotrain.sl.dal.entity.ClassUnit;

/**
 *
 * @author admin
 */
public class ClassUnitServiceImpl extends AbstractDao<ClassUnit> implements ClassUnitService {

    public ClassUnitServiceImpl() {
        super();
        this.setEntityType(ClassUnit.class);
    }

}
