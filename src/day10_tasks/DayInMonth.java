package day10_tasks;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a month with uppercase first letter:");
        String month = input.nextLine();

        if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") ||
                month.equals("August") || month.equals("October") || month.equals("December")) {
            System.out.println("This month has 31 days");
        } else if (month.equals("February")) {
            System.out.println("This month has 28 days");
        } else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
            System.out.println("This month has 30 days");
        }


    }
}