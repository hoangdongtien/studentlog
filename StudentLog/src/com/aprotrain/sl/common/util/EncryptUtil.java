/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprotrain.sl.common.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author admin
 */
public class EncryptUtil {

    public static String md5(String raw) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("md5");
        byte[] messageDigest = md5.digest(raw.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        StringBuilder hashtext = new StringBuilder(number.toString(16));
        // Now we need to zero pad it if you actually want the full 32 chars.
        while (hashtext.length() < 32) {
           hashtext.insert(0, "0");
        }
        return hashtext.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println(md5("admin"));
    }

}
