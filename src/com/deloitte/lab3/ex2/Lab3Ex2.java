package com.deloitte.lab3.ex2;

public class Lab3Ex2 {

    public static String getImage(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str + "|" + sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "EARTH";
        System.out.println("Mirror image: " + getImage(input));
    }
}
