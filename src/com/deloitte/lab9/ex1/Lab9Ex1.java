package com.deloitte.lab9.ex1;

@FunctionalInterface
interface Power {
    double compute(double x, double y);
}

public class Lab9Ex1 {

    public static void main(String[] args) {
        Power power = (x, y) -> Math.pow(x, y);  
        System.out.println("Result of 2^3: " + power.compute(2, 3)); 
    }
}

