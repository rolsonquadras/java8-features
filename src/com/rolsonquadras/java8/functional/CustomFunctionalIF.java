/* Copyright (C) 2015  Rolson Quadras

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.functional;


/**
 * Functional Interface is a interface which contains a single abstract method.
 *
 * The @FunctionalInterface annotation can be used. The functional interfaces
 * can contain a static or default method, but should contain only one abstract
 * method.
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
@FunctionalInterface
public interface CustomFunctionalIF {

    void sayHello();
}
