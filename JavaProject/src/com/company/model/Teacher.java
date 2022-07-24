package com.company.model;

import com.company.base.People;

import java.util.Comparator;

public class Teacher extends People {

    private int workhours;
    private int rate;

    public Teacher(String name, String surname, int age, Address address, int workhours, int rate) {
        super(name, surname, age, address);
        this.workhours = workhours;
        this.rate = rate;
    }

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    public int Salary(int workhours, int rate) {
        return workhours * rate;
    }


    public void changeAddressT(Address address) {
        this.address = address;
        System.out.println("Новый адрес: " + address);
    }

}



