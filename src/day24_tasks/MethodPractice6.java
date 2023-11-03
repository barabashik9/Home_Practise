package day24_tasks;

import java.util.Scanner;

public class MethodPractice6 {

    public static void palindrome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = input.nextLine();
        String reserved = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reserved += word.charAt(i);
            reserved.equalsIgnoreCase(word);
        }
        if (word.equals(reserved)){
            System.out.println("This is a palindrome!");
        }else if (!word.equals(reserved)) {
            System.out.println("This is NOT a palindrome");
        }
    }


    public static void main(String[] args) {
        palindrome();
    }
}
