/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Tien Hoang D
 */
public class WebUtil {
    public static String baseUrl(HttpServletRequest request, String url){
        StringBuilder baseurl = new StringBuilder(request.getScheme())
               .append("://")
               .append(request.getServerName())
               .append(":")
               .append(request.getServerPort());
        baseurl.append(request.getServletContext().getContextPath());
        baseurl.append(url);
        
        return baseurl.toString();
    }
    
}
