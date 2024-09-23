package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    public static int calculateDifference(int n) {
        int sumOfSquares = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        int squareOfSum = sum * sum;
        return Math.abs(sumOfSquares - squareOfSum);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Difference: " + calculateDifference(n));
    }
}

