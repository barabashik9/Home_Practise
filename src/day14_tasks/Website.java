package day14_tasks;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter website: ");
        String str = input.next();

        if (str.startsWith("www.") && str.endsWith(".com") || str.endsWith(".edu") || str.endsWith(".gov") || str.endsWith(".net")) {
            System.out.println("Your enter is correct");
        } else if (!str.startsWith("www.")) {
            System.out.println("The website has to start with www.");
        } else if (!str.endsWith(".com") || !str.endsWith(".edu") || !str.endsWith(".gov") || !str.endsWith(".net")) {
            System.out.println("Invalid entry. The website should end with .com / .edu / .gov / .net");
        }


    }
}
