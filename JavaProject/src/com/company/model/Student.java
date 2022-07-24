package com.company.model;

import com.company.base.People;

public class Student extends People implements Comparable<Student> {

    public Student(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
