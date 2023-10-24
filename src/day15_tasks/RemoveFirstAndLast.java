package day15_tasks;

import java.util.Scanner;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();


        System.out.println(firstWord.substring(1));
        System.out.println(secondWord.substring(0,secondWord.length()-1));
    }
}
