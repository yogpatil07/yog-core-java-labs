package com.deloitte.lab9.ex2;

@FunctionalInterface
interface StringFormatter {
    String format(String str);
}

public class Lab9Ex2 {

    public static void main(String[] args) {
        StringFormatter formatter = str -> String.join(" ", str.split(""));  
        System.out.println("Formatted string: " + formatter.format("CG"));  
    }
}
