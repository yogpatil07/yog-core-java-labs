package com.deloitte.lab1.ex8;

public class Lab1Ex8 {

    public static boolean checkNumber(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int number = 16;
        System.out.println("Is power of two: " + checkNumber(number));
    }
}
