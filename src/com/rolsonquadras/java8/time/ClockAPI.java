/* Copyright (C) 2015  Rolson Quadras
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.time;


import java.time.Clock;


/**
 * Class for java.time.Clock usage
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class ClockAPI {

    public static void main(final String[] args) {
        System.out.println(Clock.systemDefaultZone());
        System.out.println(Clock.systemUTC());
    }

}
