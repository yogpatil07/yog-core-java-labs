package com.deloitte.lab6.ex1;

import java.util.*;

public class Lab6Ex1 {

    public static List<Integer> getValues(HashMap<Integer, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);  
        return values;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 45);
        map.put(2, 12);
        map.put(3, 67);
        map.put(4, 33);

        List<Integer> sortedValues = getValues(map);
        System.out.println("Sorted values: " + sortedValues);
    }
}
