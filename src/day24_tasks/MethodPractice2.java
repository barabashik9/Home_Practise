package day24_tasks;

import java.util.Scanner;

public class MethodPractice2 {
    public static String eligibleToVote(int age) {
        if (age >= 18) {
            return "Eligible to Vote";
        } else {
            return "Not Eligible to Vote";
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int userAge = input.nextInt();
        System.out.println(eligibleToVote(userAge));
    }
}
