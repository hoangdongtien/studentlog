/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.dal.common;

import java.util.List;

/**
 *
 * @author admin
 */
public interface BaseDao<T> {
    List<T> listAll();
    T add(T a);
    T update(T a);
    T delete(T a);
    T saveOrUpdate(T a);
}
