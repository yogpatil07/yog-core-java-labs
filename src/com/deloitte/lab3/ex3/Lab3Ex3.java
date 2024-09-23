package com.deloitte.lab3.ex3;

public class Lab3Ex3 {

    public static void main(String[] args) {
        String input = "JAVA";
        String result = alterString(input);
        System.out.println(result); 
    }

    public static String alterString(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                result.append(c);
            } else {
                result.append((char) (c + 1));
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}