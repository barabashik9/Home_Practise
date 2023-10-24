package day15_tasks;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        String acNum = input.next();
        if (acNum.startsWith("2") && acNum.length() == 7) {
            System.out.println("Valid 7-digital account number");
        } else if (acNum.startsWith("2") && acNum.length() !=7) {
            System.out.println("Valid 7-digital account number");
        } else if (acNum.startsWith("5") && acNum.length() ==10) {
            System.out.println("Valid 5-digital account number");
        } else if (acNum.startsWith("5") && acNum.length() !=10) {
            System.out.println("Invalid 5-digital account number");
        } else if (!acNum.startsWith("2") && !acNum.startsWith("5")) {
            System.out.println("Invalid account number");
        }
    }
}
