package com.networking;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String gender;

    public Employee(int id, String fname, String lname, String gender) {
        this.id = id;
        this.first_name = fname;
        this.last_name = lname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return this.first_name;
    }

    public String getLname() {
        return this.last_name;
    }

    public String getGender(){
        return this.gender;
    }
}
