package com.example.collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class CollectionDemoTest {

    @Test
    public void testList() {
        ListExample listExample = new ListExample();
        listExample.addSubject("PHYSICS");
        listExample.addSubject("Chemistry");
        assertTrue(listExample.searchsub("PHYSICS"));
        listExample.removesub("PHYSICS");
        assertFalse(listExample.searchsub("PHYSICS"));
    }

    @Test
    public void testSet() {
        SetExample setExample = new SetExample();
        setExample.addStudent("TEJA");
        setExample.addStudent("TEJA"); // Duplicate
        assertTrue(setExample.searchStudent("TEJA"));
        setExample.addStudent("HARSHITH");
        setExample.removeStudent("TEJA");
        assertFalse(setExample.searchStudent("TEJA"));
    }

    @Test
    public void testMap() {
         MapExample.addEmployee(101, "Sumit");
        MapExample.addEmployee(102, "Ravi");

        MapExample mapExample = new MapExample();
        assertEquals("Sumit", mapExample.searchEmployee(101), "Employee ID 101 should be Sumit");
        assertEquals("Ravi", mapExample.searchEmployee(102), "Employee ID 102 should be Ravi");

        mapExample.removeEmployee(101);
        assertNull(mapExample.searchEmployee(101), "Employee ID 101 should be removed");
    }
}