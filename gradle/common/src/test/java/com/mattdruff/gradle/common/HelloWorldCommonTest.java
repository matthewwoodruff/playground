package com.mattdruff.gradle.common;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloWorldCommonTest {

    @Test
    public void shouldReturnHelloWorld() throws Exception {
        assertThat(new HelloWorldCommon().getGreeting(), is("Hello World"));
    }
}