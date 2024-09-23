package com.deloitte.lab9.ex4;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface EmployeeFactory {
    Employee create(String name);
}

public class Lab9Ex4 {

    public static void main(String[] args) {
        EmployeeFactory factory = Employee::new; 
        Employee emp = factory.create("John");
        System.out.println("Employee name: " + emp.getName());
    }
}
