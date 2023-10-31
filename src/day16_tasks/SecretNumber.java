package day16_tasks;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNumber = 9;

        while (true){
            System.out.println("Guess the secret number (1 - 100): ");
            int number = input.nextInt();
            if(secretNumber == number) {
                System.out.println("Correct number, congratulations!!!");
                break;
            } else if (number > secretNumber) {
                System.out.println("Too high");

            }else if (number < secretNumber){
                System.out.println("Too low");
            }
        }
    }
}
