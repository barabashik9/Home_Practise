package day09_tasks;

import java.util.Scanner;

public class TimInDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it? ");
        int hour = input.nextInt();

        if ( hour < 12) {
            System.out.println("Good Morning");

        }else if (hour >= 12 && hour < 15 ) {
            System.out.println("Good Afternoon");

        }else if (hour <= 15 ) {
            System.out.println("Good Evening");

        }else{
            System.out.println("Invalid !!!");
        }
    }
}
