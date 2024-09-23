package com.deloitte.lab6.ex5;

import java.util.Arrays;

public class Lab6Ex5 {

    public static int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);  
        return arr[1];    
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second smallest element: " + getSecondSmallest(arr));
    }
}
