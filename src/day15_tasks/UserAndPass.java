package day15_tasks;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = input.next();
        System.out.println("Enter your password: ");
        String password = input.next();
        int length = password.length();


        if (length >= 5 && !password.contains(userName)) {
            System.out.println("Valid password");
        } else if (length >= 5 && password.contains(userName)) {
            System.out.println("Invalid password, username should not be in it");
        } else if (length < 5 ) {
            System.out.println("Password can not be less that 5 characters");

        }


    }
}
