package day08_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = input.nextInt();

        boolean leapYear = year % 4 == 0;
        boolean nonLeapYear = year % 4 != 0;

        System.out.println("The " + year + " is a Leap year: " + leapYear );
        System.out.println("The " + year + " is not a Leap year: " + nonLeapYear );

    }
}
