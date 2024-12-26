package com.task.entity;

import java.util.Arrays;

public class FilterRequest {
    private String[] languages;

    public FilterRequest(String[] languages) {
        this.languages = languages;
    }

    public FilterRequest() {
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "FilterRequest{" +
                "languages=" + Arrays.toString(languages) +
                '}';
    }
}
