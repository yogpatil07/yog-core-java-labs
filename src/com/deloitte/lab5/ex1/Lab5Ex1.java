package com.deloitte.lab5.ex1;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {

    public static void validateAge(int age) throws AgeException {
        if (age < 15) {
            throw new AgeException("Age must be above 15");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(10);  
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            validateAge(20);  
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
