package day15_tasks;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your Last name: ");
        String lastName = input.nextLine();


        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();


        firstName = Character.toUpperCase(firstName.charAt(0)) + (firstName.substring(1));
        lastName = Character.toUpperCase(lastName.charAt(0)) + (lastName.substring(1));

        System.out.println("Your full name: " + firstName + " " + lastName);
    }
}
