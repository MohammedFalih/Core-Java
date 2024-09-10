package com.inheritance;

public class Manager extends Employee {
    private double bonus;

    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary() + bonus;
    }
}

class Employees{
    public static void main(String[] args) {
        System.out.println("\nEmployee: ");
        Employee employee = new Employee("Mohammed", 98000);
        System.out.println(employee.getName());
        System.out.println("Base salary: "+employee.getSalary());
        employee.salaryHike(10);
        System.out.println("Salary Hike: "+employee.getSalary());

        System.out.println("\nManager: ");
        Manager manager = new Manager("Falih", 140000, 40000);
        System.out.println(manager.getName());
        System.out.println("Base salary:" + manager.getSalary());
        manager.salaryHike(15.5);
        System.out.println("Salary Hike: " + manager.getSalary());
    }
}
