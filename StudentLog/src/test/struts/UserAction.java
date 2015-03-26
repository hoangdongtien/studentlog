/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.struts;

import java.util.Date;
import test.User;

/**
 *
 * @author admin
 */
public class UserAction {
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String doTest(){
        Date d = new Date();

        if (d.getTime()%2 == 1) {
            return "page1";
        } else {
            return "page2";
        }

    }
}
