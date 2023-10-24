package day12_tasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        if (1 <= age && age <= 5) {
            System.out.println("You are at elementary school");
        } else if (6 <= age && age <= 8) {
            System.out.println("You are at Middle school");
        } else if (9 <= age && age <= 12) {
            System.out.println("You are at High school");
        } else if (13 <= age && age <= 16) {
            System.out.println("You are at College");

        }else if (17 <= age && age <= 18) {
            System.out.println("You are at Grad school");

        }else {
            System.out.println("Invalid grade level given");
        }
    }
}
