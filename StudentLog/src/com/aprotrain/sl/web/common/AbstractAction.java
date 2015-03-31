/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.web.common;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author admin
 */
public abstract class AbstractAction<T>  extends ActionSupport implements BaseAction<T>, ModelDriven<T>{

}
