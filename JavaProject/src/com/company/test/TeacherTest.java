package com.company.test;

import com.company.model.Address;
import com.company.model.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TeacherTest {
    Teacher teacher1;

    @Before
    public void setUp() throws Exception {
        Address address1 = new Address("Minsk", "Lenin", 12, 56);
        teacher1 = new Teacher("Nik", "Ivanov", 42, address1, 150, 20);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");
    }

    @Test
    public void callAmount() {
        int workhours = 100;
        int rate = 10;
        teacher1.setWorkhours(workhours);
        teacher1.setRate(rate);

        int expected = workhours * rate;
        int actual = teacher1.Salary(teacher1.getWorkhours(), teacher1.getRate());

        assertTrue(expected == actual);
    }

    @Test
    public void setAgeWithZero() {
        int age = 42;

        teacher1.setAge(-20);

        assertTrue(teacher1.getAge() == age);
    }

    @Ignore
    public void setAge() {
        int age = 42;
        teacher1.setAge(age);

        assertTrue(teacher1.getAge() == age);
    }
}
