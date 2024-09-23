package com.deloitte.lab1.ex7;

public class Lab1Ex7 {

    public static boolean checkNumber(int number) {
        int previousDigit = 10;  // Larger than any single digit
        while (number != 0) {
            int currentDigit = number % 10;
            if (currentDigit > previousDigit) {
                return false;
            }
            previousDigit = currentDigit;
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Is increasing number: " + checkNumber(number));
    }
}
