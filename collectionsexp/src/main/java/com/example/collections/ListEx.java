package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    private final List<String> subjects = new ArrayList<>();

    public void addsub(String subject) {
        subjects.add(subject);
    }

    public void removesub(String subject) {
        subjects.remove(subject);
    }

    public boolean searchsub(String subject) {
        return subjects.contains(subject);
    }

    public List<String> getAllsubjects() {
        return new ArrayList<>(subjects);
    }
}