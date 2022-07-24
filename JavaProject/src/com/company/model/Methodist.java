package com.company.model;

import com.company.base.People;

public class Methodist extends People {

    private String gender;

    public Methodist(String name, String surname, int age, Address address, String gender) {
        super(name, surname, age, address);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
