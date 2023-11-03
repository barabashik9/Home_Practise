package day24_tasks;

import java.util.Scanner;

public class MethodPractice5 {

    public static void printStringChar (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println("" + str.charAt(i));
        }
    }


    public static void main(String[] args) {
        printStringChar();
    }
}
