package day16_tasks;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String converted = "";
        System.out.println("Enter a word: ");
        String word = input.next();
        for (int i = 0; i < word.length(); i++) {
            if (!converted.contains("" + word.charAt(i))){
                converted += word.charAt(i);
            }

        }
        System.out.println("With duplicate: " + word);
        System.out.println("with No duplicate: " + converted);
    }
}
