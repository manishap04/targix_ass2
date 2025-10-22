package com.example.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionDemoTe {

    @Test
    void testListOperations() {
        ListEx list = new ListEx();
        list.addsub("Maths");
        assertTrue(list.searchsub("Maths"));
        list.removesub("Maths");
        assertFalse(list.searchsub("Maths"));
    }

    @Test
    void testSetOperations() {
        SetEx set = new SetEx();
        set.addStudent("Arjun");
        set.addStudent("Arjun"); // duplicate
        assertEquals(1, set.getAllStudents().size());
        set.removeStudent("Arjun");
        assertFalse(set.searchStudent("Arjun"));
    }

    @Test
    void testMapOperations() {
        MapEx map = new MapEx();
        map.addEmployee(1, "Sumit");
        assertEquals("Sumit", map.searchEmployee(1));
        map.removeEmployee(1);
        assertNull(map.searchEmployee(1));
    }
}
