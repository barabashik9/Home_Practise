package day21_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class LongestAndShortestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] arr = new String [5];
        String biggest = "";
        String shortest = "";

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your 5 words: ");
            arr [i] = input.nextLine();
            if (i == 0 || shortest.length() > arr[i].length()){
                shortest = arr[i];
            }
            if (biggest.length() < arr[i].length()) {
                biggest = arr[i];
            }
        }
        System.out.println("The longest word: " + biggest);
        System.out.println("The shortest word: " + shortest);
    }
}
