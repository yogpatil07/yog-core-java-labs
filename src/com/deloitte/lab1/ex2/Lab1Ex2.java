package com.deloitte.lab1.ex2;
import java.util.Scanner;

public class Lab1Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Light: 1 for Red, 2 for Yellow, 3 for Green");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
