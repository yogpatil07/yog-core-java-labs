package com.deloitte.lab5.ex2;

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

public class Lab5Ex2 {

    public static void validateName(String firstName, String lastName) throws NameException {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new NameException("First name or last name cannot be blank");
        } else {
            System.out.println("Valid Name: " + firstName + " " + lastName);
        }
    }

    public static void main(String[] args) {
        try {
            validateName("", "Smith");  
        } catch (NameException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            validateName("John", "Smith");  
        } catch (NameException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
