package day21_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many classmates?");
        int numOfClassmates = input.nextInt();
        String result = "";

        String [] names = new String [numOfClassmates];
        input.nextLine();

        for (int i = 0; i < numOfClassmates; i++) {
            System.out.println("Enter classmates full name? ");
            names [i] = input.nextLine();
        }
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            result += " " + names [i].substring(0,1) + names [i].substring(names [i].indexOf(' ') + 1, names [i].indexOf(' ') + 2);
        }

        System.out.println(result);







    }
}
