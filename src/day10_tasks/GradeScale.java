package day10_tasks;

import java.util.Scanner;

public class GradeScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is a percentage number? : ");
        int number = input.nextInt();

        if (number <= 100 && number >= 85) {
            System.out.println("A:");
        } else if (number <= 84 && number >= 70) {
            System.out.println("B:");
        } else if (number <= 69 && number >= 55) {
            System.out.println("C:");
        } else if (number <= 54 && number >= 40) {
            System.out.println("D:");
        } else if (number < 40 && number > 0) {
            System.out.println("E:");
        }


    }
}
