package com.deloitte.lab3.ex9;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lab3Ex9 {

    public static void calculateDuration(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate inputDate = LocalDate.parse(date, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(inputDate, currentDate);
        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());
    }

    public static void main(String[] args) {
        String date = "15-08-1995";  
        calculateDuration(date);
    }
}
