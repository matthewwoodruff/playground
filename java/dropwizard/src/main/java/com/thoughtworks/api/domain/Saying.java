package com.thoughtworks.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {

    private long id;

    private String content;

    public Saying() {}

    public Saying(long id, String content) {
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

}
