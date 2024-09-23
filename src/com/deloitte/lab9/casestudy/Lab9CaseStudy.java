package com.deloitte.lab9.casestudy;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}

public class Lab9CaseStudy {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 50000, LocalDate.of(2010, Month.JANUARY, 5)),
            new Employee("Jane", 75000, LocalDate.of(2015, Month.MARCH, 10)),
            new Employee("Jack", 60000, LocalDate.of(2020, Month.FEBRUARY, 12))
        );

    
        double totalSalary = employees.stream()
                                      .mapToDouble(Employee::getSalary)
                                      .sum();
        System.out.println("Total Salary: " + totalSalary);

       
        employees.stream()
                 .forEach(emp -> System.out.println("Name: " + emp.getName() + ", Hire Date: " + emp.getHireDate()));
    }
}
