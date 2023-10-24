package day15_tasks;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine().trim();

        int startPoint = 0;
        int endPoint = sentence.indexOf(" ");


        String firstWord = sentence.substring(startPoint, endPoint);

        System.out.println(sentence.substring(endPoint).trim() + " " + firstWord);

    }
}
