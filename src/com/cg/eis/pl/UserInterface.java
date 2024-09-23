package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import java.util.Scanner;

public class UserInterface {
    private EmployeeService employeeService;
    private Scanner scanner;

    public UserInterface() {
        this.employeeService = new EmployeeService();
        this.scanner = new Scanner(System.in);
    }

    public void startApplication() {
        while (true) {
            System.out.println("Welcome to the Employee Insurance System");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Employee employee = employeeService.getEmployeeDetails();
                    System.out.println("Employee details entered successfully.");
                    displayEmployeeDetails(employee);
                    break;
                case 2:
                    System.out.println("Enter Employee ID:");
                    int id = scanner.nextInt();
                    // Assuming we have a method to fetch employee by ID
                    // This part of the application assumes you could store and retrieve employees
                    // Currently, this feature is a placeholder.
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private void displayEmployeeDetails(Employee employee) {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Insurance Scheme: " + employee.getInsuranceScheme() + "\n");
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.startApplication();
    }
}
