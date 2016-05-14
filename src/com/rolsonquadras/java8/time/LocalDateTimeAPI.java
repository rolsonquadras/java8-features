/* Copyright (C) 2015  Rolson Quadras
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.time;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * Class for java.time.LocalDate, java.time.LocalTime and
 * java.time.LocalDateTime usage
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class LocalDateTimeAPI {

    public static void main(final String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }

}
