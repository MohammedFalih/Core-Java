package com.inheritance;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; };
    public void setName(String name) {
        this.name = name;
    } 

    public double getSalary() { return salary; };
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void salaryHike(double percent){
        salary += salary*percent/100;
    }
    
}
