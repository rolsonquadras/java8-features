/* Copyright (C) 2015  Rolson Quadras
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.time;


import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;


/**
 * Class for java.time.Instant usage
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class InstantAPI {

    public static void main(final String[] args) {
        System.out.println(Instant.now());
        System.out.println(Instant.now(Clock.system(ZoneId.of("Asia/Calcutta"))));
        System.out.println(Instant.EPOCH);
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);
    }

}
