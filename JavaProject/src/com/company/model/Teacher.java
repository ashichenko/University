package com.company.model;

import com.company.base.People;

public class Teacher extends People {
    private String name;
    private String surname;
    private int age;
    public Address address;

    private int salary;

    public Teacher(String name, String surname, int age, Address address, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }

    public static void Salary(int workhours, int rate) {
        int salary = workhours * rate;
        System.out.println("Зарплата учителя за месяц: " + salary + " руб");
    }

    public void changeAddressT(Address address) {
        this.address = address;
        System.out.println("Новый адрес: " + address);
    }

}



