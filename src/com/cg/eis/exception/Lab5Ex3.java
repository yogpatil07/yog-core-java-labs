package com.cg.eis.exception;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

public class Lab5Ex3 {

    public static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be above 3000");
        } else {
            System.out.println("Valid Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        try {
            validateSalary(2500);  
        } catch (EmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            validateSalary(3500);  
        } catch (EmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
