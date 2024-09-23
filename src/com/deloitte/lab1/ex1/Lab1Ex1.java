package com.deloitte.lab1.ex1;

public class Lab1Ex1 {
    public static int sumOfCubes(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 123;
        System.out.println("Sum of cubes of digits: " + sumOfCubes(number));
    }
}
