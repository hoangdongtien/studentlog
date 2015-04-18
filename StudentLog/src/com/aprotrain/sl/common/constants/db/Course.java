/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.common.constants.db;

/**
 *
 * @author admin
 */
public interface Course extends DbConstants{
    public enum Status{
        DEACTIVE(0), ACTIVE(1);
        
        int value;        
        private Status(int value){
            this.value = value;
        }
    }
}
