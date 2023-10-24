package day12_tasks;

import java.util.Scanner;

public class CharUpperCaseLowerCase {

    public static void main(String[] args) {

        char letter = 'Y';
        int uppercase = 0;
        int lowercase = uppercase + 32;

        if (letter >= 97 && letter <= 122) {
            System.out.println("Letter " + letter + " is an uppercase.");
            letter -= 32;
            System.out.println(letter);

        } else if (letter >=65 && letter <= 90) {
            System.out.println("Letter " + letter + " is a lowercase.");
            letter +=32;
            System.out.println(letter);
        }

    }

}
