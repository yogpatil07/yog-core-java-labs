package com.deloitte.lab2.ex1;
import java.util.Arrays;

public class Lab2Ex1 {

    public static int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);  
        return arr[1];     
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second smallest element: " + getSecondSmallest(arr));
    }
}
