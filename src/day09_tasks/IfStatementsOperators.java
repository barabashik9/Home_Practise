package day09_tasks;

import java.util.Scanner;

public class IfStatementsOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a boolean value (true/false): ");
        boolean value = input.nextBoolean(); //false

        if (value == true ) {
              System.out.println("The opposite value is: " + !value);
        }else {
            System.out.println("The opposite value is: " + !value);
        }

    }
} /* Write a program that will accept a boolean value. Print out the opposite of the given boolean

		Ex:
			true -> false
            		false -> true


		Note: Use Scanner class and the ! (NOT) operator

		Example Output:
			Write a boolean value (true or false):
			true
			The opposite of you what you put is: false*/