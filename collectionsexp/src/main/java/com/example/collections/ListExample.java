package com.example.collections;

import java.util.*;

public class ListExample {
    private static List<String> subjects = new ArrayList<>();

    // Static add method
    public static void addSubject(String subject) {
        subjects.add(subject);
        System.out.println(subject + " added to List");
    }

    // Search method
    public void searchInteractive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject to search: ");
        String sub = sc.nextLine();

        if (subjects.contains(sub)) {
            System.out.println(sub + " found in the list");
        } else {
            System.out.println("'" + sub + "' not found in the list");
        }
    }

    // Remove method
    public void removeInteractive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject to remove: ");
        String sub = sc.nextLine();

        if (subjects.remove(sub)) {
            System.out.println(sub + " removed from the list");
        } else {
            System.out.println("'" + sub + "' not found in the list");
        }
    }

    public void displayAll() {
        System.out.println("Current List contents: " + subjects);
    }

    public boolean searchsub(String subject) {
        return subjects.contains(subject);
    }
    public boolean removesub(String subject) {
        return subjects.remove(subject);
    }
}
