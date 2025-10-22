package com.example;

import com.example.collections.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainChoice;

        do {
            System.out.println("\n===== COLLECTION TYPE MENU =====");
            System.out.println("1. List Example");
            System.out.println("2. Set Example");
            System.out.println("3. Map Example");
            System.out.println("4. Exit");
            System.out.print("Choose a collection type: ");
            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                case 1 -> runListMenu();
                case 2 -> runSetMenu();
                case 3 -> runMapMenu();
                case 4 -> System.out.println("Thank you!!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (mainChoice != 4);

        sc.close();
    }

    // List menu
    private static void runListMenu() {
        ListExample listExample = new ListExample();
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("\n--- LIST MENU ---");
            System.out.println("1. Add Subject (static)");
            System.out.println("2. Search Subject");
            System.out.println("3. Remove Subject");
            System.out.println("4. Display All");
            System.out.println("5. Back to Main Menu");
        do {
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter subject to add: ");
                    String sub = sc.nextLine();
                    ListExample.addSubject(sub);
                }
                case 2 -> listExample.searchInteractive();
                case 3 -> listExample.removeInteractive();
                case 4 -> listExample.displayAll();
                case 5 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    // Set menu
    private static void runSetMenu() {
        SetExample setExample = new SetExample();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n--- SET MENU ---");
            System.out.println("1. Add Student (static)");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All");
            System.out.println("5. Back to Main Menu");
        do {
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name to add: ");
                    String name = sc.nextLine();
                    SetExample.addStudent(name);
                }
                case 2 -> setExample.searchInteractive();
                case 3 -> setExample.removeInteractive();
                case 4 -> setExample.displayAll();
                case 5 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    // Map menu
    private static void runMapMenu() {
        MapExample mapExample = new MapExample();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n--- MAP MENU ---");
            System.out.println("1. Add Employee (static)");
            System.out.println("2. Search Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All");
            System.out.println("5. Back to Main Menu");
        do {
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    MapExample.addEmployee(id, name);
                }
                case 2 -> mapExample.searchInteractive();
                case 3 -> mapExample.removeInteractive();
                case 4 -> mapExample.displayAll();
                case 5 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}
