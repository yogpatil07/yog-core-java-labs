package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class Lab2Ex4 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 4, 3, 2, 1, 5};
        int[] result = removeDuplicatesAndSortDescending(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicatesAndSortDescending(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        Integer[] uniqueArray = set.toArray(new Integer[0]);
        Arrays.sort(uniqueArray, Collections.reverseOrder());

        int[] result = new int[uniqueArray.length];
        for (int i = 0; i < uniqueArray.length; i++) {
            result[i] = uniqueArray[i];
        }

        return result;
    }
}