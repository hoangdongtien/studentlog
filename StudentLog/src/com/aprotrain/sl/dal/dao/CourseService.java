/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.dao;

import com.aprotrain.sl.dal.common.BaseDao;
import com.aprotrain.sl.dal.entity.Course;
import java.util.List;

/**
 *
 * @author Hoang Dong Tien
 */
public interface CourseService extends BaseDao<Course>{
    List<Course> search(Course c);    
}
