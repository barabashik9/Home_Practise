package day16_tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;


        while (true){
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("You CANNOT enter negative number!");
                break;
            }
        }
    }
}
