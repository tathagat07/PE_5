package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    private static Student student;

    @BeforeClass
    public static void setUp() throws Exception {

    }

    @AfterClass
    public static void tearDown() throws Exception {
        student=null;
    }

    @Test
    public void testStudent() {

        List<Student> students = new ArrayList<>();
        Student obj1 = new Student(1, "Utkarsh", 27);
        Student obj2 = new Student(2, "Kunal", 23);
        Student obj3 = new Student(3, "Tathagat", 37);
        Student obj4 = new Student(4, "Utsav", 22);
        Student obj5 = new Student(5, "Ashish", 29);
        Student obj6 = new Student(6, "Avinash", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Tathagat', age=37}, Student{id=5, name='Ashish', age=29}, Student{id=1, name='Utkarsh', age=27}, Student{id=2, name='Kunal', age=23}, Student{id=4, name='Utsav', age=22}, Student{id=6, name='Avinash', age=22}]";
        assertEquals(expected, students.toString());


    }
}