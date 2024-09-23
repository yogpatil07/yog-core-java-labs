package com.deloitte.lab9.ex5;

import java.util.function.IntUnaryOperator;

public class Lab9Ex5 {

    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        IntUnaryOperator factOperator = Lab9Ex5::factorial; 
        System.out.println("Factorial of 5: " + factOperator.applyAsInt(5));  
    }
}
