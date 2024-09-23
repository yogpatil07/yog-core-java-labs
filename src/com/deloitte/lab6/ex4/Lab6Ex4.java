package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

    public static Map<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        Map<Integer, String> medalMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int marks = entry.getValue();
            if (marks >= 90) {
                medalMap.put(entry.getKey(), "Gold");
            } else if (marks >= 80) {
                medalMap.put(entry.getKey(), "Silver");
            } else if (marks >= 70) {
                medalMap.put(entry.getKey(), "Bronze");
            }
        }
        return medalMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(1, 85);
        studentMarks.put(2, 92);
        studentMarks.put(3, 78);

        Map<Integer, String> result = getStudents(studentMarks);
        System.out.println("Students and their medals: " + result);
    }
}
