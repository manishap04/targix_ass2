package com.example.collections;

import java.util.*;

public class MapExample {
    private static Map<Integer, String> employees = new HashMap<>();

    public static void addEmployee(int id, String name) {
        employees.put(id, name);
        System.out.println("Employee (" + id + " -> " + name + ") added to Map");
    }

    public void searchInteractive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (employees.containsKey(id)) {
            System.out.println("Employee found: " + id + " -> " + employees.get(id));
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    public void removeInteractive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID to remove: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (employees.remove(id) != null) {
            System.out.println("Employee ID " + id + " removed successfully");
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    public void displayAll() {
        System.out.println("Current Map contents: " + employees);
    }
    public String searchEmployee(int id) {
        return employees.get(id);
    }
    public void removeEmployee(int id) {
        employees.remove(id);
    }
}
