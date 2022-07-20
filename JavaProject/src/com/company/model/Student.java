package com.company.model;

import com.company.base.People;

public class Student extends People {
        private String name;
    private String surname;
    private int age;
    public Address address;

    public Student(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getSurnameame() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName() {
        this.name = name;
    }

    public void setSurnameame() {
        this.surname = surname;
    }

    public void setAge() {
        if ((age > 0) && (age < 110)) {
        }
    }

    public void setAddress() {
        this.address = address;
    }

    public void changeAddressSt (Address address){
        this.address = address;
        System.out.println("Новый адрес: " + address);
    }


}
