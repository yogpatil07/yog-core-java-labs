package com.deloitte.lab1.ex3;

public class Lab1Ex3 {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Recursive: " + fibonacciRecursive(n));
        System.out.println("Fibonacci Non-Recursive: " + fibonacciNonRecursive(n));
    }
}
