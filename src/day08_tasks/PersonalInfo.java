package day08_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your favorite number ");
        long number = input.nextLong();

        boolean areStudent = 18 <= age&& age >= 25;

        System.out.println("You are student: \n" + areStudent);





    }
}
