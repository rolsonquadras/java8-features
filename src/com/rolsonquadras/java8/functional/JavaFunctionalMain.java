/* Copyright (C) 2015  Rolson Quadras

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.functional;


/**
 * This class demonstrates the functional programming in Java using lambda
 * expression. threadStart(CustomFunctionalIF) method takes a functional
 * interface as one of the parameters. The behavior is passed using lambda
 * expressions. This class demonstrates the functional programming with java
 * build in functional interface Runnable.
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class JavaFunctionalMain {

    public static void main(final String[] args) {
        // Pre-Java 8 way of sending the behavior to a method.
        threadStart(() -> System.out.println("Hello Thread, Boring Lenghty Programming!!"));
        
        // The Java 8 way - lambda expressions can be used only with functional
        // interfaces.
        threadStart(() -> System.out.println("Hello Thread, Functional Programming!! Woohooo!"));
    }

    // private static method, just to demonstrate the funnctional programming
    private static void threadStart(final Runnable runnable) {
        new Thread(runnable).start();
    }
}
