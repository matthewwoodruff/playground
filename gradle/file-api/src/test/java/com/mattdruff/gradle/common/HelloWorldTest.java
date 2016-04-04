package com.mattdruff.gradle.common;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld() throws Exception {
        assertThat(new HelloWorld().getGreeting(), is("Hello World"));
    }
}