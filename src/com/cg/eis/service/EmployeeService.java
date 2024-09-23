package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeService {
    
    private Scanner scanner = new Scanner(System.in);

    public Employee getEmployeeDetails() {
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Employee Designation:");
        String designation = scanner.nextLine();

        Employee employee = new Employee(id, name, salary, designation);
        employee.setInsuranceScheme(findInsuranceScheme(salary, designation));

        return employee;
    }

    private String findInsuranceScheme(double salary, String designation) {
        if (salary > 20000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary <= 20000 && salary > 10000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary <= 10000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }

    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Designation: " + employee.getDesignation());
        System.out.println("Employee Insurance Scheme: " + employee.getInsuranceScheme());
    }
}
