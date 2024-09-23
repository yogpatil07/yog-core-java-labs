package com.deloitte.lab3.ex4;

public class Lab3Ex4 {

    public static void main(String[] args) {
        int input = 45862;
        int result = modifyNumber(input);
        System.out.println(result); 
    }

    public static int modifyNumber(int number1) {
        String numberStr = String.valueOf(number1);
        StringBuilder modifiedNumber = new StringBuilder();

        for (int i = 0; i < numberStr.length() - 1; i++) {
            int digit1 = Character.getNumericValue(numberStr.charAt(i));
            int digit2 = Character.getNumericValue(numberStr.charAt(i + 1));
            int difference = Math.abs(digit1 - digit2);
            modifiedNumber.append(difference);
        }

        modifiedNumber.append(numberStr.charAt(numberStr.length() - 1));
        return Integer.parseInt(modifiedNumber.toString());
    }
}