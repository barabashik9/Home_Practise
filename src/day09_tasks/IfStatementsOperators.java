package day09_tasks;

import java.util.Scanner;

public class IfStatementsOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a boolean value (true/false): ");
        boolean value = input.hasNextBoolean();
        if (value == true ) {
              System.out.println("The opposite value is: " + !value);
        }else {
            System.out.println("The opposite value is: " + !value);
        }

    }
}