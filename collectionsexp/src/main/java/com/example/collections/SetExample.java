package com.example.collections;

import java.util.*;

public class SetExample {
    private static Set<String> students = new HashSet<>();

    public static void addStudent(String name) {
        if (students.add(name)) {
            System.out.println("'" + name + "' added to Set");
        } else {
            System.out.println("'" + name + "' already exists in the Set");
        }
    }

    public void searchInteractive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (students.contains(name)) {
            System.out.println(name + "found in the Set");
        } else {
            System.out.println("'" + name + "' not found in the Set");
        }
    }

    public void removeInteractive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to remove: ");
        String name = sc.nextLine();

        if (students.remove(name)) {
            System.out.println(name + " removed from Set");
        } else {
            System.out.println("'" + name + "' not found in the Set");
        }
    }

    public void displayAll() {
        System.out.println("Current Set contents: " + students);
    }
    public boolean searchStudent(String name) {
        return students.contains(name);
    }
    public boolean removeStudent(String name) {
        return students.remove(name);
    }
}
