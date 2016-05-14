/* Copyright (C) 2015  Rolson Quadras

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/


package com.rolsonquadras.java8.functional;


/**
 * This class demonstrates the functional programming in Java using lambda
 * expression. display(CustomFunctionalIF) method takes a functional interface
 * as one of the parameters. The behavior is passed using lambda expressions.
 * This class demonstrates the functional programming with custom functional
 * interface.
 *
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class CustomFunctionalMain {

    // Java Application launcher
    public static void main(final String[] args) {
        // Pre-Java 8 way of sending the behavior to a method.
        display(() -> System.out.println("Hello, Boring Lenghty Programming!!"));
        
        // The Java 8 way - lambda expressions can be used only with functional
        // interfaces.
        display(() -> System.out.println("Hello, Functional Programming!! Woohooo!"));
    }

    // private static method, just to demonstrate the funnctional programming
    private static void display(final CustomFunctionalIF funcIF) {
        funcIF.sayHello();
    }
}
