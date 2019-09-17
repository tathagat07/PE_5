package com.stackroute;

import java.util.Comparator;

public class Student {

    private int age;
    private int id;
    private String name;


    public Student(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() == s2.getAge()) {
            if (s1.getName().equals(s2.getName()))
                return s2.getId() - s1.getId();
            else
                return s2.getName().compareTo(s1.getName());
        } else {
            return s2.getAge() - s1.getAge();
        }
    }

}