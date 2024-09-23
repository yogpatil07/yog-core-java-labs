package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] arr) {
        Map<Integer, Integer> squareMap = new HashMap<>();
        for (int num : arr) {
            squareMap.put(num, num * num);  
        }
        return squareMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Map<Integer, Integer> result = getSquares(arr);
        System.out.println("Numbers and their squares: " + result);
    }
}
