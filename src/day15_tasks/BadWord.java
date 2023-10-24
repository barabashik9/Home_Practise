package day15_tasks;

import day09_tasks.IfStatementsOperators;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = input.nextLine();

        if (message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
            System.out.println("Message not sent");
        }else {
            System.out.println("message sent");
        }
    }
}
