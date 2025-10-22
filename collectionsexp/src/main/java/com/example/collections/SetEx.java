package com.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    private final Set<String> studentNames = new HashSet<>();

    public void addStudent(String name) {
        studentNames.add(name);
    }

    public void removeStudent(String name) {
        studentNames.remove(name);
    }

    public boolean searchStudent(String name) {
        return studentNames.contains(name);
    }

    public Set<String> getAllStudents() {
        return new HashSet<>(studentNames);
    }
}
