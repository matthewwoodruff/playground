package com.thoughtworks.api.domain;

import java.time.LocalDate;

public class Saying {

    private long id;
    private String content;
    private LocalDate date;

    public Saying() {}

    public Saying(long id, String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDate() {
        if (date == null) {
            throw new NullPointerException(  );
        }
        return date;
    }
}
