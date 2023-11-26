package com.akash.demo.entity;

public class Student {

    private String firstName;

    private String lastName;

    private String middleName;

    private Integer id;


    public Student(){


    }

    public Student(String firstName, String lastName, String middleName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
