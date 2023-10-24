package day15_tasks;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = input.next();

        if (word.length() % 2 == 0) {
            System.out.println("Your word has even characters");
            System.out.println("The middle characters are: " + word.charAt((word.length()/2 - 1)) + word.charAt((word.length()/2)));
        }else {
            System.out.println("Your word has odd characters");
            System.out.println("The middle character is: " + word.charAt(word.length()/2));
        }
    }
}
