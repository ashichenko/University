package com.company.test;

import com.company.model.Address;
import com.company.model.Student;
import com.company.model.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PeopleTest {

    Student student1;

    @Before
    public void setUp() throws Exception {
        Address address1 = new Address("Vitebsk", "Vsneev", 101, 98);
        student1 = new Student("Tom", "Smith", 18, address1);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");
    }

    @Test
    public void setAgeWithZero() {
        int age = 42;

        student1.setAge(-20);

        assertTrue(student1.getAge() == age);
    }

    @Ignore
    public void setAge() {
        int age = 42;
        student1.setAge(age);

        assertTrue(student1.getAge() == age);
    }

}
