package com.mattdruff.gradle.common;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CommonTaskTest {

    @Test
    public void shouldBeAllGood() throws Exception {
        assertThat(new CommonTask().getStatus(), is("all is good"));
    }
}