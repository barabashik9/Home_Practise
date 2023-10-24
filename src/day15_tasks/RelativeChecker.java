package day15_tasks;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you full name: ");

        String nameOne = input.nextLine();
        String nameTwo = input.nextLine();


        String lastNameOne = nameOne.substring((nameOne.indexOf(" "))).trim();
        String lastNameTWo = nameTwo.substring((nameTwo.indexOf(" "))).trim();

        if (lastNameOne.equalsIgnoreCase(lastNameTWo)) {
            System.out.println("Related");
        }else {
            System.out.println("Not related");
        }
    }
}
