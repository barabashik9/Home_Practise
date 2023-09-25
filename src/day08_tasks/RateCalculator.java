package day08_tasks;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a salary $");
        double salary = input.nextDouble();

        int weeksPerYear = 52;
        double hoursPerDay = 8;
        double daysPerWeek = 5;
        double weeklyHours = hoursPerDay * daysPerWeek;

        double perHour = salary/(weeklyHours*weeksPerYear);
        System.out.println("Hourly rate of the employee: $" + perHour);






    }
}
