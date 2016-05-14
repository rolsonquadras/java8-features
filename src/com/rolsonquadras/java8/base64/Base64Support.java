/* Copyright (C) 2015  Rolson Quadras

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.base64;


import java.nio.charset.StandardCharsets;
import java.util.Base64;


/**
 * Utitlity class to see the validate the Base64 encryption support in Java8.
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class Base64Support {

    public static void main(final String[] args) {
        final String text = "Base64 test using Java 8 standard API !!";
        System.out.println("Text for Base64 testing = " + text);
        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println("Base64 encoded representation of the String = " + encoded);
        final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println("Base64 decoded representation of the String = " + decoded);
        if (decoded.equals(text)) {
            System.out.println("SUCCESS : String before and after coversion is equal !!");
        } else {
            System.out.println("FAILURE : String before and after coversion is NOT equal !!");
        }
    }
}
