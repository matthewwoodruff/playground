package com.thoughtworks.java8.functionalInterfaces;

// Validates interface
@FunctionalInterface
public interface MyFunctionalInterface {

    // only allow one abstract method
    int ungaBungaInt(int a);
//    String ungaBungaString();

    // as many defaults as you like
    default int doSomething() {
        System.out.println("doing something");
        return 1;
    }

    default int doSomethingElse() {
        return 1;
    }

    // even static methods
    static void doSomethingStatic() {
        System.out.println("Static things");
    }

}
