package com.thoughtworks.java8;

public interface DefaultMethods {

    default void doHello() {
        System.out.println("Hello");
    }

    static void staticMethodOnInterface() {

    }

}
