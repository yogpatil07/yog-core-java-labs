package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;

public class Lab3Ex1 {

    public static void main(String[] args) {
        String input = "10 20 30 40 50";
        StringTokenizer st = new StringTokenizer(input);
        int sum = 0;
        System.out.println("The integers are:");
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            System.out.println(number);
            sum += number;
        }
        System.out.println("Sum of integers: " + sum);
    }
}
