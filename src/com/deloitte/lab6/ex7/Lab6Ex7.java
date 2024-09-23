package com.deloitte.lab6.ex7;

import java.util.Arrays;

public class Lab6Ex7 {

    public static int[] getSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
            arr[i] = Integer.parseInt(sb.reverse().toString()); 
        }
        Arrays.sort(arr);  
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {123, 456, 789, 234, 567};
        int[] result = getSorted(arr);
        System.out.println("Reversed and sorted array: " + Arrays.toString(result));
    }
}

