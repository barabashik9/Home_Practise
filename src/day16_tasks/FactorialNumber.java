package day16_tasks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int factorial = 1;


        for (int i = 1; i >= 1 ; i--) {
            factorial = num*factorial;
        }
        System.out.println("Your factorial is: " + factorial);
    }
}
