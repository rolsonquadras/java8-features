/* Copyright (C) 2015  Rolson Quadras

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.*/

package com.rolson.interface_methods;

/**
 * Java main class to show the use of default and static method support in Java8
 * interfaces.
 * 
 * @author rolson.quadras@gmail.com
 * @since 1.0.0
 */
public class DefaultMethodMain implements DefaultMethodIF {

	public static void main(String[] args) {
		// Static method in the interface
		DefaultMethodIF.staticSayHello();
		new DefaultMethodMain().testDefault();
	}

	private void testDefault() {
		// default method in the interface, which is available for the
		// implementing classes by default.
		this.defaultSayHello();
	}
}
