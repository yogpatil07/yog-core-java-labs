package com.deloitte.lab2.ex2;
import java.util.Arrays;

public class Lab2Ex2 {

    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); 
        int mid = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                arr[i] = arr[i].toUpperCase();  
            } else {
                arr[i] = arr[i].toLowerCase();  
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Mango", "Cherry", "Peach"};
        String[] result = sortStrings(arr);
        System.out.println("Sorted and modified array: " + Arrays.toString(result));
    }
}
