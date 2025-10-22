package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    private final Map<Integer, String> employeeMap = new HashMap<>();

    public void addEmployee(int id, String name) {
        employeeMap.put(id, name);
    }

    public void removeEmployee(int id) {
        employeeMap.remove(id);
    }

    public String searchEmployee(int id) {
        return employeeMap.get(id);
    }

    public Map<Integer, String> getAllEmployees() {
        return new HashMap<>(employeeMap);
    }
}
