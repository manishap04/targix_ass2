package com.example;

import com.example.collections.ListEx;
import com.example.collections.MapEx;
import com.example.collections.SetEx;

public class Main {
    public static void main(String[] args) {
        ListEx listExample = new ListEx();
        listExample.addsub("Maths");
        listExample.addsub("Science");
        listExample.addsub("Social Studies");
        System.out.println("List: " + listExample.getAllsubjects());

        SetEx setExample = new SetEx();
        setExample.addStudent("Ravi");
        setExample.addStudent("Anita");
        setExample.addStudent("Ravi");
        System.out.println("Set: " + setExample.getAllStudents());

        MapEx mapExample = new MapEx();
        mapExample.addEmployee(101, "Megh");
        mapExample.addEmployee(102, "Manji");
        mapExample.addEmployee(103, "Lux");
        System.out.println("Map: " + mapExample.getAllEmployees());

        System.out.println("Search 'Science' in List: " + listExample.searchsub("Science"));
        listExample.removesub("Science");
        System.out.println("After removing 'Science': " + listExample.getAllsubjects());
    }
}