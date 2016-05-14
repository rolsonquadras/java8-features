/* Copyright (C) 2015  Rolson Quadras

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.interface_methods;


/**
 * Interface which contains new Java8 default method and staic method support in
 * Java8.
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public interface DefaultMethodIfc {

    default void defaultSayHello() {
        System.out.println("Hello, I'm a default method in Java 8 Interface.");
    }

    static void staticSayHello() {
        System.out.println("Hello, I'm a static method in Java 8 Interface.");
    }
}
