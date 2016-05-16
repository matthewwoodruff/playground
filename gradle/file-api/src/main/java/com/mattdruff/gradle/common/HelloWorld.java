package com.mattdruff.gradle.common;

public class HelloWorld {

    public String getGreeting() {
        return "Hello World";
    }

    public boolean isAllGood() {
        return new HelloWorldCommon().getGreeting() != null;
    }

}
