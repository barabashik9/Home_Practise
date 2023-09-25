package day10_tasks;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your age: " );
        int age = input.nextInt();


        if (age > 0 && age <= 1) {
            System.out.println("You are Infant");
        } else if (age >= 3 && age <= 5 ) {
            System.out.println("You are Toddler");
        } else if (age >= 6 && age <= 9) {
            System.out.println("You are Kid");
        } else if (age >= 10 && age <= 12) {
            System.out.println("You are Pre-Teen");
        } else if (age >= 13 && age <= 17) {
            System.out.println("You are Teenager");
        } else if (age >= 18 && age <= 20) {
            System.out.println("You are Young Adult");
        } else if (age >= 21 && age <= 35) {
            System.out.println("You are Adult");
        } else if (age >= 36 && age <= 55) {
            System.out.println("You are Middle-Age Adult");
        } else if (age >= 55 && age <= 120) {
            System.out.println("You are Senior Citizen");
        } else if (age > 120 || age < 0) {
            System.out.println("invalid entry");
        }
    }
}
