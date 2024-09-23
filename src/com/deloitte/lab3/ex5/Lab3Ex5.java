package com.deloitte.lab3.ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab3Ex5 {

    public static void main(String[] args) {
        String filePath = "D:\\Work\\Java Assignments\\bin\\com\\deloitte\\lab3\\ex5\\abc.txt\\"; 
        try {
            displayTextStatistics(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void displayTextStatistics(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String line;
        while ((line = reader.readLine()) != null) {
            lineCount++;
            characterCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        reader.close();

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}