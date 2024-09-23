package com.deloitte.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

    public static List<Integer> votersList(HashMap<Integer, Integer> people) {
        List<Integer> eligibleVoters = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : people.entrySet()) {
            int age = entry.getValue();
            if (age >= 18) {
                eligibleVoters.add(entry.getKey()); 
            }
        }
        return eligibleVoters;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> people = new HashMap<>();
        people.put(1, 25);
        people.put(2, 16);
        people.put(3, 32);

        List<Integer> voters = votersList(people);
        System.out.println("Eligible voters: " + voters);
    }
}
